def project = 'RubenSemiao/jenkins-jobs'
def branchApi = new URL("https://api.github.com/repos/${project}/branches")
def branches = new groovy.json.JsonSlurper().parse(branchApi.newReader())
for (it in branches) {
    def branchName = it.name
    def jobName = "${project}-${branchName}".replaceAll('/', '-')
    job(jobName) {
        scm {
            git("git://github.com/${project}.git", branchName)
        }
        steps {
            maven("test -Dproject.name=${project}/${branchName}")
        }
    }
}
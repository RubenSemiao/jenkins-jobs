pipelineJob('Opensapps') {
    logRotator(-1, 3)
    definition {
        cpsScm {
            scm {
                github('RubenSemiao/jenkins-jobs', 'jobs')
            }
        }
    }
    scriptPath('JenkinsFile')
    triggers {
        githubPush()
    }
}
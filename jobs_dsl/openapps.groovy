job('openapps') {
    logRotator(-1, 10)
    scm {
        github('RubenSemiao/jenkins-jobs', 'jobs')
    }
    triggers {
        githubPush()
    }
}
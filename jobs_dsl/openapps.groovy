pipelineJob('Openapps') {
    logRotator(-1, 3)
    definition {
        cpsScm {
            scm {
                github('RubenSemiao/jenkins-jobs', 'jobs')
            }
        }
    }
    triggers {
        githubPush()
    }
}
pipelineJob('Opensapps') {
    logRotator(-1, 3)
    definition {
        cpsScm {
            scm {
                github('RubenSemiao/jenkins-jobs', 'jobs')
            }
        }
    }
    scriptPath ('openapps/JenkinsFile')
    triggers {
        githubPush()
    }
}
pipelineJob('Aplicações') {
    logRotator(-1, 3)
    definition {
        cpsScm {
            scm {
                github('RubenSemiao/jenkins-jobs', 'jobs'){
                }
            }
            scriptPath("monitoring/Jenkinsfile")
        }
    }
    triggers {
        githubPush()
    }
}
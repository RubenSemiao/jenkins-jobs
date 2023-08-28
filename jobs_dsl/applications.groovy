pipelineJob('Aplicações') {
    logRotator(-1, 3)
    definition {
        cpsScm {
            scm {
                github('RubenSemiao/jenkins-jobs', 'jobs'){
                    credentials('github') // Replace with your credentials ID
                }
            }
            scriptPath("monitoring/Jenkinsfile")
        }
    }
    triggers {
        githubPush()
    }
}
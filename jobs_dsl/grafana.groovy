pipelineJob('Grafana') {
    logRotator(-1, 3)
    definition {
        cpsScm {
            scm {
                github('RubenSemiao/jenkins-jobs', 'jobs'){
                }
            }
            scriptPath("grafana/Jenkinsfile")
        }
    }
    triggers {
        githubPush()
    }
}
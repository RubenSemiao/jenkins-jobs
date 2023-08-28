pipelineJob('Aplicações') {
    logRotator(-1, 3)
    definition {
        cpsScm {
            scm {
                github('RubenSemiao/namespaces', 'dev')
            }
        }
        scriptPath("monitoring/Jenkinsfile")
    }
    triggers {
        githubPush()
    }
}
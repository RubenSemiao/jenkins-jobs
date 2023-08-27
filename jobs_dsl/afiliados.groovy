pipelineJob('Afiliados') {
    logRotator(-1, 3)
    definition {
        cpsScm {
            scm {
                github('RubenSemiao/jenkins-jobs', 'jobs')
            }
            scriptPath("afiliados/Jenkinsfile")
        }
    }
    triggers {
        githubPush()
    }
}
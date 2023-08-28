pipelineJob('Afiliados') {
    logRotator(-1, 3)
    definition {
        cpsScm {
            scm {
                github('RubenSemiao/websites', 'afiliados')
                credentials('github') // Replace with your credentials ID
            }
        }
    }
    triggers {
        githubPush()
    }
}
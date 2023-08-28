pipelineJob('Afiliados') {
    logRotator(-1, 3)
    definition {
        cpsScm {
            scm {
                github('RubenSemiao/websites', 'afiliados')
            }
        }
    }
    triggers {
        githubPush()
    }
}
pipelineJob('Afiliados') {
    logRotator(-1, 3)
    definition {
        cpsScm {
            scm {
                github('RubenSemiao/websites', 'afiliado')
            }
        }
    }
    triggers {
        githubPush()
    }
}
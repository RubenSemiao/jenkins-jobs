pipelineJob('Openapps') {
    logRotator(-1, 3)
    definition {
        cpsScm {
            scm {
                github('RubenSemiao/websites', 'openapps')
            }
        }
    }
    triggers {
        githubPush()
    }
}
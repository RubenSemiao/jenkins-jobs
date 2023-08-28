pipelineJob('Openapps') {
    logRotator(-1, 3)
    definition {
        cpsScm {
            scm {
                github('RubenSemiao/websites', 'openapps')
                credentials('github') // Replace with your credentials ID
            }
        }
    }
    triggers {
        githubPush()
    }
}
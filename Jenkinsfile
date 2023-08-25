pipelineJob('openapps') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/RubenSemiao/openapps.git')
                    }
                    branch('*/master')
                }
            }
            lightweight()
        }
    }
}
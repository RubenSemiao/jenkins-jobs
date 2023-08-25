pipelineJob('new-app') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/RubenSemiao/websites.git')
                    }
                    branch('*/master')
                }
            }
            lightweight()
        }
    }
}
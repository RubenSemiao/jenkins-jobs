job('Afiliados') {
    logRotator(-1, 3)
    scm {
        github('RubenSemiao/jenkins-jobs', 'jobs')
    }
    triggers {
        githubPush()
    }
}
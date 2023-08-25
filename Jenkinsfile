pipeline {
    agent any
    options{
            buildDiscarder(logRotator(numToKeepStr: '3', daysToKeepStr: '5'))
            timestamps()
            skipStagesAfterUnstable()
        }
        environment{

            imagename = "rubenalmeida/website"
            registryCredential = 'docker'
            dockerImage = ''
        }
    stages {
        stage('1 - Clean workspace') {
            steps {
                sh 'rm -rf openapps'
            }
        }
        stage('2 - Git Update') {
            steps {
                git credentialsId: 'github', url: 'https://github.com/RubenSemiao/openapps.git'
            }
        }
        stage('3 - Docker Build') {
            steps {
                script{
                    dockerImage = docker.build imagename
                }
            }
        }
        stage('4 - Docker Push') {
            steps{
                script {
                  docker.withRegistry( '', registryCredential ) {
                  dockerImage.push('latest')
                  }
                }
            }
        }
        stage('5 - Deploy Application on argocd') {
            steps {
                script {
                  sh ' kubectl apply -f https://raw.githubusercontent.com/RubenSemiao/jenkins-jobs/master/openapps/application.yaml'
                }
            }
        }
    }
}
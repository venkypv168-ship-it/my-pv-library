pipeline {
    agent any
    stages {
        stage('welcome') {
            steps {
                script {
                    hello('linux')
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    buildapp()
                }
            }
        }
        stage('deploy') {
            steps {
                script {
                    deployapp()
                }
            }
        }
    }
}

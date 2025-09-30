pipeline {
    agent any
stage('deploy') {
            steps {
                script {
                    deployapp()
                }
            }
        }
     }

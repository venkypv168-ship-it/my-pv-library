pipeline {
    agent any
stage('Build') {
            steps {
                script {
                    buildapp()
                }
            }
        }
}

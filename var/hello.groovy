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
    }
}

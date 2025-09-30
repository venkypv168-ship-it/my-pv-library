pipeline {
    agent any

    stages {
        stage('Test Hello') {
            steps {
                script {
                    hello('Venky')
                }
            }
        }
    }
}

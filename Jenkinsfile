@Library('Shared_Library') _

pipeline {
    agent any

    stages {
        stage('welcome') {
            steps {
                script {
                    hello()
                }
            }
        }

        stage('Clean Workspace') {
            steps {
                script {
                    cleanworkspace()
                }
            }
        }

        stage('Clone') {
            steps {
                script {
                    clonerepo()
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    build()
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    deploy()
                }
            }
        }
    }
}

@Library('my-pv-library') _
pipeline {
    agent any
  stages {
        stage('Clean Workspace') {
            steps {
                echo 'Cleaning workspace'
                deleteDir()
            }
        }
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

pipeline {
    agent any
    stages {
         stage('Checkout') {
            steps {
                sh 'echo checkout'
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/buehlmau/DevOpsDemoNew']])
            }
        }
        stage('Test') {
            steps {
                sh 'echo test'
                jacoco()
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo HalloNeuesJenkinsFile'
            }
        }
    }
}

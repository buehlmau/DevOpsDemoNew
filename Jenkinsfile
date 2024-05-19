pipeline {
 agent any
 stages {
 stage('Checkout') {
 steps {
 sh 'echo checkout'
 checkout scmGit(branches: [[name: '*/U5']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/mscattzhw/DevOpsDemo.git']])
 }
 }
 stage('Test') {
 steps {
 sh 'echo test'
 }
 }
 stage('Deploy') {
 steps {
 sh 'echo deploy'
 }
 }
 }
}

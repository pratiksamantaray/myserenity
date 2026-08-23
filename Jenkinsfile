pipeline {
    agent any

    environment {
          MAVEN_OPTS = '-Xmx1024m'
    }

    triggers {
        githubPush()
    }

    options {
        timestamps()
        disableConcurrentBuilds()
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh './mvnw clean test'
            }
        }

       /*  stage('Package') {
            steps {
                sh './mvnw -q -DskipTests package'
            }
        } */

        stage('Docker Build') {
            steps {
                sh 'docker build -t myserenity:${BUILD_NUMBER} .'
            }
        }
    }

    post {
        always {
           junit allowEmptyResults: true,
                 testResults: 'target/failsafe-reports/*.xml'
        }
        success {
            echo 'Build and tests passed.'
        }
        failure {
            echo 'Build failed. Check logs and test reports.'
        }
    }
}

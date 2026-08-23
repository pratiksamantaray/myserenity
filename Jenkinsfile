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

        stage('Build & Test') {
            steps {
                sh './mvnw clean verify'
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
pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                sh 'mvn clean package -DskipTests=true'
            }
        }
        stage('Tests'){
            steps{
                sh 'mvn test'
            }
        }
         stage('Deploy'){
            steps{
               deploy adapters: [tomcat9(credentialsId: 'TomcatLogin', path: '', url: 'http://localhost:8082/')], contextPath: 'calculadora', war: 'target/calculadora.war'
            }
        }
    }
}
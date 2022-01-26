pipeline {
    agent any

    stages {
        stage('Build & Unit Test') {
            steps {
                script {
					bat './gradlew clean build'
                    println "Stage: ${env.STAGE_NAME}"                      
                }
                
            }
        }
        stage('Sonar') {
            steps {
                script {
					def scannerHome = tool 'sonar-scanner';
					withSonarQubeEnv('sonarqube-server') { 
					bat "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=Sonarqube-jenkins -Dsonar.projectBaseDir=c:/repo/ejemplo-gradle/ -Dsonar.sources=src -Dsonar.java.binaries=build" 
					}                    
                }
                
            }
        }
        stage('Run') {
            steps {
                script {
                    //println "Stage: ${env.STAGE_NAME}"       
					//bat 'nohup bash gradlew bootRun &'
					bat "start /min gradlew spring-boot:run &"
					println "probar manual en navegador: http://localhost:8081/rest/mscovid/test?msg=testing"
					sleep 20
                }
                
            }
        }
        stage('Testing Application') {
            steps {
                script {
                    println "Stage: ${env.STAGE_NAME}"   
                    //bat "curl -X GET 'http://localhost:8081/rest/mscovid/test?msg=testing"
                }
                
            }
        }
        stage('Nexus') {
            steps {
                script {
                    println "Stage: ${env.STAGE_NAME}"                      
                }
                
            }
        }
	}
}
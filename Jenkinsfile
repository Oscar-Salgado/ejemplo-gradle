pipeline {
    agent any
	
	parameters {
	choice choices: ['gradle', 'maven'], description: 'indicar herramienta de construcción', name: 'buildTool'
	}

    stages {
		stage('Pipeline') {
			steps{
				script{
					println 'Pipeline'
				}
			}			
		}
	}
}
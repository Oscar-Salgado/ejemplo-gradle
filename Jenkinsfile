pipeline {
    agent any
	
	parameters {
	choice choices: ['gradle', 'maven'], description: 'indicar herramienta de construcciÃ³n', name: 'buildTool'
	}

    stages {
		stage('Pipeline') {
			steps{
				script{
					println 'Pipeline'
					
					println params.buildTool
					
                    if (params.buildTool=="gradle") {
                            println 'Ejecutar Gradle'
                    } else {
                        println 'Ejecutar Maven'
                    }
				}
			}			
		}
	}
}
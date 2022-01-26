pipeline {
    agent any
	
	parameters {
	choice choices: ['gradle', 'maven'], description: 'indicar herramienta de construcciÃƒÂ³n', name: 'buildTool'
	}

    stages {
		stage('Pipeline') {
			steps{
				script{
					println 'Pipeline'
					
					println params.buildTool
					
                    if (params.buildTool=="gradle") {
                            println 'Ejecutar Gradle'
                            def ejecucion = load 'gradle.groovy'
                            ejecucion.call()
                    } else {
                        println 'Ejecutar Maven'
                        def ejecucion = load 'maven.groovy'
                        ejecucion.call()
                    }
				}
			}			
		}
	}
}
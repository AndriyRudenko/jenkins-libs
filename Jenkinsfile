//@Library ('test') _


pipeline {
    agent any
    environment {
                        MY_LIST = "TEST"
                        MY_LIST2 = "TEST2"
                    }
    stages {
        stage ('Test') {

            steps {
                
                git branch: 'main', url: 'https://github.com/AndriyRudenko/jenkins-libs.git'

                    

                    sh '''
                    envsubst < test.test > test.yaml
                    '''
                   



                    
                
            }
        }
    }
}


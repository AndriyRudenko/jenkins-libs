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
                
                

                    

                    sh '''
                    envsubst < test.test > test.yaml
                    '''
                   



                    
                
            }
        }
    }
}


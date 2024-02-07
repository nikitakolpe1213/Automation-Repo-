pipeline {
     agent any 
     stages {
  stage('Build') {
         steps {
             echo 'Build World'
        }
     }
    stage('Deploy') {
           steps {
                 echo 'Test World'
                  }
             }
     stage('Test') {
            steps {
                 echo 'Deploy World'
                  }
             }
        }
 post
  {
    always
      {
         emailext body: 'summary' , subject: 'Pipeline status' , to: 'nikitakolpe8@gmail.com'
      }
    }
}

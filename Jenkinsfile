node{
  environment {
    PATH = "C:\\Program Files\\Git\\usr\\bin;C:\\Program Files\\Git\\bin;${env.PATH}"
    stage('SCM Checkout'){
      git 'https://github.com/jonselvaa/springmvcdemo'
    }
    stage('Complile-Package'){
      sh 'mvn package'
    }
  }
}

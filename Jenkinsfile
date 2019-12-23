node{
  stage('SCM Checkout'){
    git 'https://github.com/jonselvaa/springmvcdemo'
  }
  stage('Complile-Package'){
    sh 'mvn package'
  }
}

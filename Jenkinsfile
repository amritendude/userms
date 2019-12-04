
node{

  stage('Build'){

   sh 'mvn clean package'

  }

  stage('Sonar'){

   sh 'mvn sonar:sonar'

  }

}

node {
   def mvnHome
   def workspace = pwd()
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      //git branch: 'master', credentialsId: 'root', url: 'git@github.com:SingleTigger/spring-boot-docker.git'
      checkout scm
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // ** in the global configuration.
      mvnHome = tool 'maven'
   }
   stage('Build') {
      // Run the maven build
     sh "'${mvnHome}/bin/mvn'  -Dmaven.test.skip=true clean package -P spring-boot-docker docker:build"
   }
}
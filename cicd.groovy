node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/helloport.git'), string(name: 'PORT_DESCRIPTION', value: 'The GNU Hello program produces a familiar, friendly greeting.' )]
  }
}

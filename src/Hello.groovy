def call(String name = 'User', script) {
 echo "Welcome, ${name}."
 
 script.echo "Current workspace is $env.WORKSPACE"
}

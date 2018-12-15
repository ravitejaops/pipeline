#!groovy.

node {
    sh 'env > ENV'
    println readFile('ENV').trim()
}

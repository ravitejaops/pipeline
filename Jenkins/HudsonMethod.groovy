#!groovy.
import hudson.model.*

node {

     printAllMethods (Hudson)
}

void printAllMethods( obj ){
    if( !obj ){
        println( "Object is null\r\n" );
        return;
    }
    if( !obj.metaClass && obj.getClass() ){
        printAllMethods( obj.getClass() );
        return;
    }
    def str = "class ${obj.getClass().name} functions:\r\n";
    obj.metaClass.methods.name.unique().each{
        str += it+"(); ";
    }
    println "${str}\r\n";
}


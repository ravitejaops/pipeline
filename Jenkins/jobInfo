#!groovy.
import hudson.model.*

node {

    echo "getting jobs"
    getJobs ()
}

def getJobs(){
    //def hi=Hudson.instance.getAllItems(hudson.model.Job.class)
    //println hi
    def hi=Hudson.instance.getJobNames()
    print hi
}
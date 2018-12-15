#!groovy.


node {

  echo "workspace is $workspace"
  echo "job name is $JOB_NAME"

    //Creating object of the File
    File file = new File("$workspace/../../jobs/$JOB_NAME/builds/lastSuccessfulBuild")
    echo "file is $file"

    //Getting the canonical path, i.e. the symbolic link
    String path = file.getCanonicalPath();
    echo "path is $path"
}



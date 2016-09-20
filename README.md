# plain-old-java-objects

ForRent Java Beans useful across multiple code bases.

## Compiling JAR

`./gradlew build`

## Uploading Jar file to mavenrepo.forrent.com

After your code has been reviewed and merged into master, download and run this file https://github.dominionenterprises.com/ForRentAPI/java-beans/blob/master/build/scripts/java-beans-deploy.sh

`./java-beans-deploy`

It will increment the build number and upload a RELEASE version of the jar file

If you want to upload a version of your review branch run the script but this time pass in the name of your review branch as argument

`./java-beans-deploy review/COR-1222`


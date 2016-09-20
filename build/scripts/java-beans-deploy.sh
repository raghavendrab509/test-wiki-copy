#!/usr/bin/env bash

WORKING_BRANCH = "deploy/next"

if [ $1 ]
then
   WORKING_BRANCH = $1
fi

git clone git@github.dominionenterprises.com:ForRentAPI/java-beans.git

cd java-beans

git checkout $WORKING_BRANCH




if [ $WORKING_BRANCH == "deploy/next" ]
then
   ./gradlew incrementBuildNumber
   
   git commit -a -m "Increment Version Build Number"
   
   git push remote origin "deploy/next"
   
   git checkout "master"
   
   git merge "deploy/next"
   
   git push origin master
   
fi

./gradlew clean build uploadArchives -Drepo.username=frc_maven_repo -Drepo.password=FRCarchive1


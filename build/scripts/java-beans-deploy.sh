#!/usr/bin/env bash



working_branch='master'

if [ $1 ]
then
   working_branch=$1
fi

echo $working_branch

git clone git@github.dominionenterprises.com:ForRentAPI/java-beans.git

cd java-beans

git checkout $working_branch




if [ $working_branch='master' ]
then
   ./gradlew incrementPatchNumber
   
   git commit -a -m "Increment Version Patch Number"
   
   git push origin master
   
fi

./gradlew clean build uploadArchives -Drepo.username=frc_maven_repo -Drepo.password=FRCarchive1

cd ..
rm -rf java-beans/


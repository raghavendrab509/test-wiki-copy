#!/usr/bin/env bash

tmp_dir="tmp-java-beans-$(date +"%s")"
working_branch='master'

if [ $1 ]
then
   working_branch=$1
fi

echo Using Branch: $working_branch

git clone git@github.dominionenterprises.com:ForRentAPI/java-beans.git $tmp_dir

cd $tmp_dir

# Exit if specified branch doesn't exist
if ! git checkout $working_branch
    then
    rm -rf ../$tmp_dir
    exit 1
fi

if [ $working_branch='master' ]
then
   ./gradlew incrementPatchNumber

   git commit -a -m "Increment Version Patch Number"

   git push origin master
fi

./gradlew clean build uploadArchives -Drepo.username=frc_maven_repo -Drepo.password=FRCarchive2

cd ..
rm -rf $tmp_dir

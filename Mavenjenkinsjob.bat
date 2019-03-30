@echo on
SET PROJECT_PATH=D:\Manoj WorkSpace\MavenJenkinsJob

cd /D %PROJECT_PATH%

call mvn clean
call mvn compile
call mvn test

pause
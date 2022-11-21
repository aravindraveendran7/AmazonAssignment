FROM aravindrav/maven-testdep
COPY src home/amazonassignment/src
COPY pom.xml home/amazonassignment/pom.xml
COPY testng.xml home/amazonassignment/testng.xml
WORKDIR home/amazonassignment
ENTRYPOINT mvn clean test -Pall
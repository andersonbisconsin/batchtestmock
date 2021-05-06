
# Build an executable JAR

You can run the application from the command line with Gradle or Maven. You can also build a single executable JAR file that contains all the necessary dependencies, classes, and resources and run that. Building an executable jar makes it easy to ship, version, and deploy the service as an application throughout the development lifecycle, across different environments, and so forth.

If you use Gradle, you can run the application by using ./gradlew bootRun. Alternatively, you can build the JAR file by using ./gradlew build and then run the JAR file, as follows:

>     `java -jar build/libs/gs-batch-processing-0.1.0.jar`

If you use Maven, you can run the application by using ./mvnw spring-boot:run. Alternatively, you can build the JAR file with ./mvnw clean package and then run the JAR file, as follows:

>     `java -jar target/gs-batch-processing-0.1.0.jar`

The steps described here create a runnable JAR. You can also build a classic WAR file.
The job prints out a line for each person that gets transformed. After the job runs, you can also see the output from querying the database. It should resemble the following output:

> Converting (firstName: Jill, lastName: Doe) into (firstName: JILL, lastName: DOE)  
> Converting (firstName: Joe, lastName: Doe) into (firstName: JOE, lastName: DOE)  
> Converting (firstName: Justin, lastName: Doe) into (firstName: JUSTIN, lastName: DO)  
> Converting (firstName: Jane, lastName: Doe) into (firstName: JANE, lastName: DOE)  
> Converting (firstName: John, lastName: Doe) into (firstName: JOHN, lastName: DOE)

    Found <firstName: JILL, lastName: DOE> in the database.  
    Found <firstName: JOE, lastName: DOE> in the database.
    Found <firstName: JUSTIN, lastName: DOE> in the database.
    Found <firstName: JANE, lastName: DOE> in the database.
    Found <firstName: JOHN, lastName: DOE> in the database.





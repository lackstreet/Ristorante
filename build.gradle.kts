
plugins {
    java
    application
}
application{
    mainClass.set("lackstreet.Main")


}

group = "org.lackstreet"
version = "1.0-SNAPSHOT"

repositories{
    mavenCentral()
}

//abilitare driver jdbc (potevo scriverlo anche nel file db_connect ma ho voluto usare una task
tasks.register("Db_") {
    doFirst {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver")
    }

}
tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}

dependencies{
    implementation("com.microsoft.sqlserver:mssql-jdbc:10.2.0.jre11")

}


//Blocco pubblicazione su gradle...
extensions.findByName("buildScan")?.withGroovyBuilder {
    setProperty("termsOfServiceUrl", "https://gradle.com/terms-of-service")
    setProperty("termsOfServiceAgree", "no")
}
# Java Collections Exercises

A small Java project for practicing Java collections such as:

- ArrayList
- HashSet
- HashMap
- TreeMap
- LinkedHashSet
- Queue

The exercises are located in:

```text
src/main/java/se/lexicon/CollectionExercises.java
```

### Requirements:
- Java 21 or newer
- Maven

 Check versions:
```text
java -version
mvn -version
```
### Compile
```text
- mvn compile
```

### Run
```text
- mvn exec:java -Dexec.mainClass="se.lexicon.CollectionExercises"
```

If the exec:java command does not work, add the Maven Exec Plugin to pom.xml.

### Run Tests
```text
- mvn test
```

### Project Structure
```text
src
├── main
│   └── java
│       └── se
│           └── lexicon
│               └── CollectionExercises.java
└── test
    └── java
        └── se
            └── lexicon
                └── CollectionExercisesTest.java
```
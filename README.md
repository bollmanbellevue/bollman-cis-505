# bollman-cis-505
Bellevue CIS 505 - Intermediate Java Programming

## Running from command line
1. cd to directory
2. Run compile command
    - ```javac *.java```
3. Run the run command 
    - ```java {EntryClassName}```

## Creating a jar file for an assignment
1. cd to directory
2. Run create jar command
    - ```jar cf {FileName}.jar *.java```
3. Run extract jar command 
    - ```jar xf {FileName}.jar```

## Running a JavaFX app
1. cd to directory
2. Run compile 
    - ```javac --module-path ../javafx-sdk-19/lib --add-modules=javafx.controls {FileName}.java```
3. Run the run command
    - ```java --module-path ../javafx-sdk-19/lib --add-modules=javafx.controls {EntryClassName}```
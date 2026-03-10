dev:
    @mvn -q compile && mvn -q exec:java

test:
    @mvn test
# prog-poe

This repository provides a minimal Java Maven template for small coursework and starter applications. It keeps the setup lightweight while staying compatible with standard IDE workflows (including NetBeans and IntelliJ).

It uses the [Just](https://github.com/casey/just) task runner for local development, but this can be replaced with alternatives.

## Getting Started

First, compile the project:

```bash
mvn compile
```

Then run the application:

```bash
mvn exec:java
```

Or run the project with Just:

```bash
just dev
```

The project is configured for Java 21, but the `maven.compiler.release` property in `pom.xml` can be changed if a different JDK version is required.

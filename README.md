# Neo4j Spring MVC Maven Archetype

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)](https://github.com/aveekcom/project1)
[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](LICENSE)
[![Java Version](https://img.shields.io/badge/Java-11%2B-orange)](pom.xml)

A sample REST API built with Neo4j, Spring MVC, and the GraphAware Framework. Exposes a `GET /count` endpoint that returns the total number of nodes in the Neo4j database.

## Prerequisites

- Java 11+
- Maven 3.6+

## Build

```bash
mvn clean package
```

## Run

Deploy the resulting WAR to a servlet container (e.g., Apache Tomcat) running alongside a Neo4j server with the GraphAware Framework.

## API

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | `/count` | Returns total node count |

## Test

```bash
mvn test
```

## License

This project is licensed under the GNU General Public License v3. See [LICENSE](LICENSE) for details.

Originally generated from the [GraphAware Neo4j Spring MVC Archetype](https://github.com/graphaware/neo4j-spring-mvc-archetype).

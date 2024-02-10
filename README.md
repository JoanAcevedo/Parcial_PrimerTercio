# Lab 03 de CVDS

## Configuración inicial

### CREAR UN PROYECTO CON MAVEN

Primero, creamos el proyecto de Maven con los siguientes parámetros

 ```shell
Grupo (groupId): edu.eci.cvds
Artefacto (artifactId): ClasesEquivalencia
Paquete (package): edu.eci.cvds.tdd
archetypeArtifactId: maven-archetype-quickstart
 ```

 Usando el comando 

 ```shell
 mvn -B archetype:generate -DgroupId=edu.eci.cvds -DartifactId=ClasesEquivalencia -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4  -Dpackage=edu.eci.cvds.tdd
 ```

### ACTUALIZAR Y CREAR DEPENDENCIAS EN EL PROYECTO

 Agreamos JUnit a nuestro proyecto, actualizando el README con la siguiente información

```xml
<!-- https://mvnrepository.com/artifact/junit/junit -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
```

### COMPILAR Y EJECUTAR
Compilamos el programa usando

```shell
mvn package
```

Y probamos los tests utilizando
```shell
mvn test
```
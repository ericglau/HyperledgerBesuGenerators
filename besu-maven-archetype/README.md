# Hyperledger Besu Maven Archetype

Prerequisites:
* [JDK 8 or higher](https://adoptopenjdk.net/)
* [Maven](https://maven.apache.org/install.html)

## Installing the archetype

1. Clone this project.  

2. From the project directory:  
`mvn install`

## Using the archetype to create a sample project

1. From any directory on your filesystem:  
`mvn archetype:generate -DarchetypeCatalog=local`

## Running the sample project

1. Compile contracts, build project, and install Hyperledger Besu:  
`mvn clean install`

2. Start Hyperledger Besu:  
`target/besu-1.4.0/bin/besu --config-file=config.toml`

3. Wait until you see `Ethereum main loop is up`

4. From another terminal at your sample project directory, compile and start your application:  
`mvn compile exec:java -Dexec.mainClass="com.sample.App"`

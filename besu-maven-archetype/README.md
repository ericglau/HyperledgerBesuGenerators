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

1. Have two terminals open in the sample project.

2. In the first terminal, run the following to compile contracts, build project, and install Hyperledger Besu:  
`mvn clean install`

3. In the second terminal, run the following to start Hyperledger Besu:  
`target/besu-1.3.4/bin/besu --config-file=config.toml`

4. Wait until you see `Ethereum main loop is up`

5. In the first terminal, run the following to compile and start your application:  
`mvn compile exec:java -Dexec.mainClass="com.sample.App"`

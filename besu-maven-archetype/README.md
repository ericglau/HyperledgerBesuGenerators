# Hyperledger Besu Maven Archetype

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

2. Run Hyperledger Besu:  
`target/besu-1.3.4/bin/besu --config-file=config.toml`

3. Compile and run your application:  
`mvn compile exec:java -Dexec.mainClass="com.sample.App"`
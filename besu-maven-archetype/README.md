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

### Single command

This builds the project, runs Besu in the background, and starts your app.

`mvn clean install && target/besu-1.3.4/bin/besu --config-file=config.toml > logfile.log tail -f -n0 logfile.log | grep -q 'Ethereum main loop is up' && mvn exec:java -Dexec.mainClass="com.sample.App"`

### Or multiple commands 

1. Have two terminals open in the sample project.

2. In the first terminal, compile contracts, build project, and install Hyperledger Besu:  
`mvn clean install`

3. In the second terminal, start Hyperledger Besu:  
`target/besu-1.3.4/bin/besu --config-file=config.toml`

4. Wait until you see `Ethereum main loop is up`

5. In the first terminal, compile and start your application:  
`mvn compile exec:java -Dexec.mainClass="com.sample.App"`

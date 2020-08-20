# Hyperledger Besu sample project

## Running the sample project locally

1. Compile contracts, build project, and install Hyperledger Besu:  
   `gradle clean build installBesu`

2. Start Hyperledger Besu:  
   `build/besu-1.5.0/bin/besu --config-file=config.toml`

3. Wait until you see `Ethereum main loop is up`

4. From another terminal at your sample project directory, compile and start your application:  
   `gradle run`

## Running the sample project in a container

`appsody run`

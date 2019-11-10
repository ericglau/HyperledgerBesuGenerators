# BesuGenerator

Build sample project: `mvn clean install`

Build archetype: `mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-archetype -DarchetypeVersion=1.4`

Run Besu:
`target/besu-1.3.4/bin/besu --network-id=2018 --genesis-file=genesis-file --rpc-http-enabled --rpc-ws-enabled --min-gas-price=0 --miner-enabled --miner-coinbase 0xD254c71075AA9caB58916affd043D3d86c8d832f`

Run class:
`mvn exec:java -Dexec.mainClass="com.sample.App"`
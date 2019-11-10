# BesuGenerator

Build sample project: `mvn clean install`

Build archetype: `mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-archetype -DarchetypeVersion=1.4`

Run Besu:
`target/besu-1.3.4/bin/besu --network=dev --rpc-http-enabled --rpc-ws-enabled --min-gas-price=0 --miner-enabled --miner-coinbase 0xD254c71075AA9caB58916affd043D3d86c8d832f`

If the above command doesn't work due to genesis block issue, run `rm -rf target/besu-1.3.4/database/` and try the above again.

Run class:
`mvn exec:java -Dexec.mainClass="com.sample.App"`
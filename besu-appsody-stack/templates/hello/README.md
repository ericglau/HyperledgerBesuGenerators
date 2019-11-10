# BesuGenerator

Build sample project, including compiling contracts and installing Hyperledger Besu: `mvn clean install`

Build archetype: `mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-archetype -DarchetypeVersion=1.4`

Run Hyperledger Besu:
`target/besu-1.3.4/bin/besu --config-file=config.toml`

If the above command doesn't work due to a genesis block issue, run `rm -rf target/besu-1.3.4/database/` and try the above again.

Run class:
`mvn exec:java -Dexec.mainClass="com.sample.App"`

Recompile and run class:
`mvn compile exec:java -Dexec.mainClass="com.sample.App"`
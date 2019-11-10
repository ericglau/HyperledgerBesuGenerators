# BesuGenerator

Build sample project: `mvn clean install`

Build archetype: `mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-archetype -DarchetypeVersion=1.4`

Run Besu:
target/besu-1.3.4/bin/besu --network=dev --rpc-http-enabled=true

Run class:
mvn exec:java -Dexec.mainClass="com.sample.App"
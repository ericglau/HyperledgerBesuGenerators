# Appsody Stack for Hyperledger Besu Plugins

[Appsody](https://appsody.dev/) stack for developers writing Java plugins using the [Hyperledger Besu Plugin API](https://besu.hyperledger.org/en/stable/Reference/Plugin-API-Interfaces/).

Developers can initialize a sample project based on [PluginsAPIDemo](https://github.com/PegaSysEng/PluginsAPIDemo) with a single command, and use another command to start their development runtime entirely on a container. Once the project is running, iterative development is enabled which will update the plugin when source changes are detected.

## Prerequisites

- [Docker](https://www.docker.com/)
- [Appsody](https://appsody.dev/)

## Build stack

`appsody stack package`

## Initialize sample project

From an empty directory:
`appsody init dev.local/java-besu-plugins`

## Run development stack

`appsody run`

## Iterative development

Any changes you make to Java files or build.gradle will be automatically redeployed to the container within seconds. When the sample project is running, simply refresh http://localhost:9545/metrics to see the updated results after you make code changes.

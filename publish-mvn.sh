#!/bin/bash

echo "mvn publish..."
mvn deploy -Dregistry=https://maven.pkg.github.com/freight-trust -Dtoken=GH_TOKEN
xw
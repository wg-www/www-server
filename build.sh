#!/usr/bin/env bash
set -e

mvn clean package -Dmaven.test.skip=true

echo "Build success. target: ./target/www-server-0.0.1-SNAPSHOT.jar"
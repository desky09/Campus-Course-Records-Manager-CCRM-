#!/bin/bash
mkdir -p out
javac -d out src/main/java/main/*.java src/main/java/main/*/*.java
echo "Compilation complete."

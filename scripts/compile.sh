#!/bin/bash
mkdir -p out
# Compile targeting Java 21 (requires JDK 21)
javac --release 21 -d out src/main/Main.java src/main/model/*.java src/main/dao/*.java src/main/service/*.java src/main/util/*.java
if [ $? -ne 0 ]; then
	echo "Compilation failed. Ensure JDK 21 is installed and on PATH."
	exit 1
fi
echo "Compilation complete."

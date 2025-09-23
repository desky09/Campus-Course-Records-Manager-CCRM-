@echo off
mkdir out 2>nul
javac -d out src/main/Main.java src/main/model/*.java src/main/dao/*.java src/main/service/*.java src/main/gui/*.java src/main/util/*.java
echo Compilation complete.

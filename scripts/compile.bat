@echo off
mkdir out 2>nul
rem Compile targeting Java 21 (requires JDK 21)
javac --release 21 -d out src/main/Main.java src/main/model/*.java src/main/dao/*.java src/main/service/*.java src/main/util/*.java
if %errorlevel% neq 0 (
	echo Compilation failed. Ensure JDK 21 is installed and on PATH.
	exit /b %errorlevel%
)
echo Compilation complete.

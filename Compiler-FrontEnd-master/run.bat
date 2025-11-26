@echo off
java -jar jflex-full-1.9.1.jar Scanner.flex
javac scanner.java
java scanner inputScanner.txt

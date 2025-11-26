@echo off

set "FLEX=lib\jflex-full-1.9.1.jar"
set "CUP=lib\java-cup-11b.jar"
set "LIBS=.;lib\java-cup-11b.jar;lib\java-cup-11b-runtime.jar"

echo === Gerando Scanner ===
java -jar %FLEX% scanner.flex

echo === Gerando Parser ===
java -jar %CUP% -parser parser -symbols sym parser.cup

echo === Compilando Java ===
javac -cp "%LIBS%" Main.java scanner.java parser.java sym.java ast\*.java

echo === Executando ===
java -cp "%LIBS%" Main

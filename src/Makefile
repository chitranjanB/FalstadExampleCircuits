all:
	javac *.java

jar: circuit.jar

src:
	cd .. && zip -r circuit-src.zip src/Makefile src/*.java src/*.txt src/circuits/

run: all
	java Circuit

circuit.jar: all
	jar cfm circuit.jar Manifest.txt *.class *.txt circuits/

clean:
	rm -f *.class circuit.jar

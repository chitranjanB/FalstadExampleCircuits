name = buzzr

all:
	javac *.java

jar: $(name).jar
	chmod +x $(name).jar

src:
	cd .. && zip -r circuit-src.zip src/Makefile src/*.java src/*.txt src/circuits/

run: all
	java Circuit

$(name).jar: all
	jar cfm $(name).jar Manifest.txt *.class *.txt circuits/

clean:
	rm -f *.class $(name).jar

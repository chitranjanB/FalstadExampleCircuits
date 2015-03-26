name = buzzr

all:
	@echo "Makefile is outdated, please use ant if possible!"
	javac src/*.java

jar: $(name).jar
	@echo "Makefile is outdated, please use ant if possible!"
	chmod +x $(name).jar

run: all
	java Circuit

$(name).jar: all
	@echo "Makefile is outdated, please use ant if possible!"
	jar cfm $(name).jar Manifest.txt *.class *.txt circuits/

clean:
	rm -f *.class $(name).jar

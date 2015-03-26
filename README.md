Buzzr
=====

This is an electronics tutorial based on Paul Falstad's circuit simulator (original available at <http://www.falstad.com/circuit/>).

Building
--------

The preferred build process is using Apache Ant: use `ant compile` to build, then `ant run` to run the application.

If you don't have `ant`, but have `make`, run `make jar` to compile, and then `make run` to run the application.

If you have neither, compile with `javac src/*.java`, build the jar file with `jar cfm buzzr.jar Manifest.txt *.class *.txt circuits/`, and run the application with `java -jar buzzr.jar`.

Terms and Conditions
--------------------

The terms and conditions for the original code still apply. Check <http://www.falstad.com/licensing.html> before redistributing or modifying the code. You must always consult the original licensing information but, in case the link is unavailable, here is a copy of the original license (as of 2013-05-08):

    You have permission to use these applets in a classroom setting or take
    screenshots as long as the applets are unmodified. Modification or
    redistribution for non-commercial purposes is allowed, as long as you
    credit me (Paul Falstad) and provide a link to my page (the page you
    found the applet(s) on, or http://www.falstad.com/mathphysics.html).

    Contact me for any other uses. The source code for each applet is
    generally available on that applet's web page, but some of the applets
    use third-party source code that has restrictions.

    THIS SOFTWARE IS PROVIDED ``AS IS'' AND WITHOUT ANY EXPRESS OR IMPLIED
    WARRANTIES, INCLUDING, WITHOUT LIMITATION, THE IMPLIED WARRANTIES OF
    MERCHANTIBILITY AND FITNESS FOR A PARTICULAR PURPOSE.

Thanks
------

Paul Falstad (original author), Rodrigo Hausen (added improvements).

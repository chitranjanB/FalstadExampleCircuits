Untitled
========

This is an electronics tutorial based on Paul Falstad's circuit simulator (original available at <http://www.falstad.com/circuit/>).

Building
--------

If you have `make` installed, just `cd src`, `make`, and then `make jar`.

If not, compile with `javac *.java` and build the jar file with `jar cfm circuit.jar Manifest.txt *.class *.txt circuits/`

Running
-------

As an application: `java -jar circuit.jar`

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
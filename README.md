# glacier-cli
[![Build Status](https://secure.travis-ci.org/coreyjonoliver/glacier-cli.png)](http://travis-ci.org/coreyjonoliver/glacier-cli)

glacier-cli is a command line tool for interfacing with Amazon Glacier.

## Installation

### Windows

Download ``glacier-cli.jar`` and place in a directory of your choosing.

In the same directory, create a file ``glacier-cli`` with the following contents:

    $ set SCRIPT_DIR=%~dp0
    $ java -jar "%SCRIPT_DIR%glacier-cli.jar" %*

Lastly add the directory to your ``PATH`` system variable so ``glacier-cli`` can be run easily from any directory.

### Unix

Download ``glacier-cli.jar`` and place it in ``~/bin``.

In the ``~/bin`` directory, create a file ``glacier-cli`` with the following contents:

    $ java -jar `dirname $0`/sbt-launch.jar "$@"

Also, be sure to make sure to give the execute permission:

    $ chmod u+x ~/bin/glacier-cli

## Running glacier-cli

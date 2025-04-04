#!/usr/bin/env python
# not sure this will work btw

import sys
import subprocess

path_to_classroot = "../target/classes/"
path_from_classroot_to_classfile = "at/technikum/eigenspec/"
cmd_name = "essort"
print(sys.argv)
runarray = [
    "java",
    "-classpath",
    path_to_classroot,
    path_from_classroot_to_classfile+cmd_name,
    #"help",
]
print(runarray)
subprocess.call(runarray)

#!/bin/bash

while read -r line; do java -jar ../../../target/validator-alpha.jar "$line"; done < tests.txt
#!/usr/bin/env bash
find app/src/ -name '*.javat' -exec bash -c 'mv "${1}" "${1/javat/java}"' _ {} \;


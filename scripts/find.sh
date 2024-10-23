#!/usr/bin/env bash
echo "find app/src/ -name \"$1\" -exec cat {} \;"
echo ""
find app/src/ -name "$1" -exec cat {} \;

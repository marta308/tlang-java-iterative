#!/bin/bash

#START=$(date +%s%N)

java -cp ./tlang-iterative.jar exampleprogs.Main in out

#END=$(date +%s%N)
#DIFF=$((( $END - $START ) / 1000000))
#echo "It took $DIFF milliseconds"


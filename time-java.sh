#!/bin/bash

#START=$(date +%s%N)

java -cp ./tlang-iterative-1wf.jar exampleprogs.Main in/recipes/5-rewrites.txt in

#END=$(date +%s%N)
#DIFF=$((( $END - $START ) / 1000000))
#echo "It took $DIFF milliseconds"


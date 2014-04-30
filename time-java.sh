#!/bin/bash

#START=$(date +%s%N)

java -cp ./tlang-iterative_1.jar exampleprogs.Main in/recipes/15-rewrites.txt in

#END=$(date +%s%N)
#DIFF=$((( $END - $START ) / 1000000))
#echo "It took $DIFF milliseconds"


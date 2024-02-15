#!/bin/bash

PNG_DIR=~/findings_dir/queue

for png_file in "$PNG_DIR"/*.png
do
    echo "Testing file: $png_file"
    # Run pngtest on each file
    ./pngtest "$png_file"

    # Capture the coverage data after each test
    gcov *.c

    # Optional: remove coverage data files (.gcda) if you want clean coverage for each file
   # rm *.gcda
done

# Remove the output PNG file to avoid confusion in future tests
rm pngout.png

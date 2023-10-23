#!/usr/bin/env bash
rm -rf pdf
pdflatex -output-directory pdf -job-name "Projektarbeit" tex/entry.tex
pdflatex -output-directory pdf -job-name "Projektarbeit" tex/entry.tex

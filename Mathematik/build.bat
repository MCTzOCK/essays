@echo off
rmdir /S /Q pdf

cd src

pdflatex -output-directory ../pdf -job-name "Mathematik LK" arbeitsmappe.tex
pdflatex -output-directory ../pdf -job-name "Mathematik LK" arbeitsmappe.tex

cd ..

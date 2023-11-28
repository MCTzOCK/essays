@echo off
rmdir /S /Q pdf

"C:\Program Files\MiKTeX\miktex\bin\x64\pdflatex.exe" -output-directory pdf -job-name "Projektarbeit" tex/entry.tex
biber pdf/Projektarbeit
"C:\Program Files\MiKTeX\miktex\bin\x64\pdflatex.exe" -output-directory pdf -job-name "Projektarbeit" tex/entry.tex
"C:\Program Files\MiKTeX\miktex\bin\x64\pdflatex.exe" -output-directory pdf -job-name "Projektarbeit" tex/entry.tex

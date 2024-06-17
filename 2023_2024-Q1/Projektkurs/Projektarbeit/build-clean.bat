@echo off
rmdir /S /Q pdf

cd src

"C:\Program Files\MiKTeX\miktex\bin\x64\pdflatex.exe" -output-directory ../pdf -job-name "Projektarbeit" entry.tex
biber ../pdf/Projektarbeit
"C:\Program Files\MiKTeX\miktex\bin\x64\pdflatex.exe" -output-directory ../pdf -job-name "Projektarbeit" entry.tex
biber ../pdf/Projektarbeit
"C:\Program Files\MiKTeX\miktex\bin\x64\pdflatex.exe" -output-directory ../pdf -job-name "Projektarbeit" entry.tex

cd ..

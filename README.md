# Program 3, Spell Checker

_**The following information was supplied by the instructor**_

---

[TOC]

---

In Files

**Programming Assignment 3: Spell Checker ver 1.0**

**START WORKING ON THIS NOW!!!**

**Completed Assignment Due on March 13th**

Title: **Spellchecking with Recursive Binary Search.**

Automated spell checkers are used to analyze documents and locate words that might be misspelled. These programs work by comparing each word in the document to a large dictionary of words. If the word is not found in the dictionary, it is flagged as potentially incorrect.

## Write a program to perform spell-checking on a text file.

To do this, you will need to get a large file of English words in alphabetical order, read this file (use the given _dictionary.txt_) and store the words in an array **(NOT an ArrayList)**.

Next, your program should prompt for a file to analyze (use the given _oliver.txt_) and then search for every word in “Oliver” in the “dictionary” file using your own recursive binary search algorithm. **Do not use the binarySearch method in Arrays class!!!**

**(Important)** When reading ‘oliver.txt’ file, you are required to remove any special characters in the file and consider only the alphabetical words.

If a word is not found in the dictionary, print it on the screen as potentially incorrect. In addition, count the number of incorrectly spelled words, count the number of correct words and the total number of words, and output these counters.

## What to Turn in: (All typed)

### Cover page (page 1): 

Your name, assignment number, assignment title, and due date.

### One page abstract (page 2): 

Describe the problem (description is given above), then explain the algorithm (design details are accepted, but not implementation detail), finally explain your observations and the results of the algorithm. Make sure to check spellings and grammar. The abstract should be typed in Times New Roman style font with single spacing and the font size of 12.

### Source Program(s): 

Turn in Java source code(s) and as a docx. All programs must follow Object Oriented Programming Principles and include proper **Javadoc** comments including pre/post conditions.

### Outputs: 

Turn in a docx containing counters for total number of words, number of correctly spelled words, number of incorrectly spelled words, and amount of time taken for the complete search. Must include proper labels to identify these outputs.

## NOTE:

You can design a class with a String array of N elements (You can open the dictionary.txt file in Wordpad and find the # of words, so you know the N), a method to read dictionary file, a method to read “analyzethis.txt” file, a method to perform binary search, and a method to output all the information.

_Warning: This program may have slow execution time._
# Autocompleter
* [Problem](#problem)
* [Solution](#solution)

## Problem
Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.

For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].

Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.

## Solution

First list of words gets sorted alphabetically. Each word starting with the same letter is put to separate array to speed up searching. When autocomplete is requested algorithm looks up first letter and searches specific array for all thr words.

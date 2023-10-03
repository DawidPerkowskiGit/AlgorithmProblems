# Message decoder
* [Problem](#problem)
* [Solution](#solution)

## Problem
Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decodable. For example, '001' is not allowed.

## Solution
This algorithm uses recursion to find valid words and decode them. At each iteration it determines if it can decode next letter or two, since there are 26 english alphabet letters. 
If at the end of decoding step it processed last letter(s) it adds currently decoded message to the list. At the end it counts all the decoded words and returns the value.

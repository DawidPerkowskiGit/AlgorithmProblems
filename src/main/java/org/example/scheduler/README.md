# Job scheduler
* [Problem](#problem)
* [Solution](#solution)

## Problem
Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.
## Solution

Schedules are added to the list, then sorted by delay. Time left to execution of each task is calculated based on task delay, and they are launched accordingly.
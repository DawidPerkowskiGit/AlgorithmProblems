# Latest order list
* [Problem](#problem)
* [Solution](#solution)

## Problem
You run an e-commerce website and want to record the last N order ids in a log. Implement a data structure to accomplish this, with the following API:

    record(order_id): adds the order_id to the log
    get_last(i): gets the ith last element from the log. i is guaranteed to be smaller than or equal to N.

You should be as efficient with time and space as possible.

## Solution

The solution uses Java's List and to correctly represent list of items added from the last to first, method get_last() needs to call (list.size() - i) element.
For example there are 5 elements in the list, 6th element gets added. The last element added is called by method get_last(1), actual method which gets called is list.get(6 - 1). 
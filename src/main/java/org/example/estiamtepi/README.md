# Estimate Pi value
* [Problem](#problem)
* [Solution](#solution)

## Problem
The area of a circle is defined as πr^2. Estimate π to 3 decimal places using a Monte Carlo method.

Hint: The basic equation of a circle is x^2 + y^2 = r^2.

## Solution
Calculating value of PI with Monte Carlo method relies on providing number samples, in this case by generating random numbers from range [-1; 1], assuming the r = 1. 
A point with random coordinates (x,y) will always lie in the square of side 2r, but not always in the circle of radius 1r. Both square and circle have their centers in the point (0,0).
Area of a circle = Pi * r ^ 2
Area of square = 4 * r ^ 2

So the area of circle / area of square = Pi / 4

For the large number of generated point we can assume they completely cover both square and circle, so we can assume as follows:

Numbers of points inside circle / number of points inside square = Pi / 4

Pi = (4 * Numbers of points inside circle) / number of points inside square

Bigger sample size means more points cover both figures areas meaning more accurate estimate.
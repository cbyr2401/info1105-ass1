java_info1105_ass1 - Cian Byrne and Nisal Jayalath
# Description #

You are provided with an ADT and implementation of an arbitrary tree. For each part of this
assignment you will need to implement some methods which act on Trees.

# Submission Details #

This assignment is due by 1pm on Monday 14th September . No late submissions accepted (unless covered by an approved Special Consideration request).
If your assignment is incomplete, please submit your work before the deadline anyway even if you do not expect it to pass any of the automatic tests. Please do this even if you intend to apply for Special Consideration. If you know in advance that you will not be able to complete the assignment on time, then ask your tutor for advice, and try to focus on completing a subset of the tasks.

## To PASTA: ##
* Source code in ZIP file
## To eLearning: ##
* Your report, which should be a typed document (.pdf or .txt prefered)
* A signed and completed cover sheet

# Overview of Assignment #
You are provided with an ADT and implementation of an arbitrary tree. For each part of this assignment you will need to implement some methods which act on Trees. 

This assignment is worth 8% of your final grade. 

Each of the four parts to this assignment will be marked automatically, on PASTA. The automatic tests make up 70% of the mark for this assignment. The remaining 30% of the marks will be allocated by hand, based on our assessment of the overall quality of your code and of your report. 

Skeleton code is available for download on Piazza and eLearning. This code contains the required interfaces for each part of the assignment and a base tree implementation that your code will extend. Do not modify any of the files in the “interfaces” or “simpletree” packages. None of your added code should be in a package (i.e. in (default), just like all the weekly tasks. 

Some basic unit tests to get your testing started will be provided at a later date. These will correspond to no more than half the available automatic marks. The remaining tests will be hidden, it is up to you to make sure that your tests are sufficiently broad!


## Part 1: Hand Marking [20%] ##
Part of your mark is based on the overall quality of your code. Your code will be assessed on the following criteria. This is not an exhaustive list, but a guideline to give an idea of the sort of qualities we will be looking for:

* Commenting
* Code Quality
* Efficiency and Maintainability

## Part 2: Tree traversals [15%] ##

```
#!java

List<E> preOrder()
List<E> postOrder()
List<E> inOrder()
```


## Part 3: Tree properties [25%] ##

```
#!java

int height()
int height(int maxDepth)
int numLeaves()
int numLeaves(int depth)
int numPositions(int depth)
boolean isBinary()
boolean isProperBinary()
boolean isCompleteBinary()
boolean isBalancedBinary()
boolean isHeap(boolean min)
boolean isBinarySearchTree()
```


## Part 4: Comparing trees [15%] ##

```
#!java

int compareTo(Tree<E> other)
```


## Part 5: Arithmetic Expressions [15%] ##

```
#!java

boolean isArithmetic()
double evaluateArithmetic()
String getArithmeticString()
```



# Version #

    0.1 - 06/09/2015 - Initial release - Cian Byrne
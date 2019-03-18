[![Run Status](https://api.shippable.com/projects/5ab50d83806e27070049c7a1/badge?branch=master)](https://app.shippable.com/github/johspaeth/PathExpression)

# Path Expression

This repository contains an implementation of an algorithm by Tarjan that computes path expressions
based on a labeled graph. A path expression is a regular expression describing all paths between
two nodes in the labeled graph.

The implementation is according to chapter 2 of the paper
[Fast Algorithms for Solving Path Problems](https://dl.acm.org/citation.cfm?id=322273).
Please note that this is neither the algorithm with runtime *O(m α(m,n))*
nor the algorithm with runtime *O(m log n)* mentioned in the abstract of the paper.

For a fixed node *v* this implementation computes *n* path expressions --
one path expression from *v* to *u* for every node *u* in the graph.
Computing all these path expressions at once for a fixed *v* has time complexity
of at most *O(n³+m)*. For sparse graphs the time complexity may be substantially lower.

*n* = number of nodes in the graph\
*m* = number of edges in the graph

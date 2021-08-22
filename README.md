# Topological_sort
There are many islands that are connected by one-way bridges, that is, if a bridge connects 
islands a and b, then you can only use the bridge to go from a to b but you cannot travel back 
by using the same. If you are on island a, then you select (uniformly and randomly) one of 
the islands that are directly reachable from a through the one-way bridge and move to that 
island. You are stuck on an island if you cannot move any further. It is guaranteed that if 
there is a directed path from one island to the second there is no path that leads from the 
second back to the first. In other words the formed graph is a Directed Acyclic Graph. 
Find the island that you are most likely to get stuck on; that is the island that you can 
possibly reach with the maximum number of paths from all other islands. 
 
Input format: 
First line: Three integers n (the number of islands), m (the number of one-way bridges), and r 
(the index of the island you are initially on) 
Next m lines: Two integers ui and vi representing a one-way bridge from island ui to vi. 
Output format: 
Print the index of the island that you are most likely to get stuck on. If there are multiple 
islands, then print them in the increasing order of indices (space separated values in a single 
line). 
Sample input 
5 7 1 
1 2 
1 3 
1 4 
1 5 
2 4 
2 5 
3 4 
Sample output 
4 

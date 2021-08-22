Void main{
Read n (the number of islands) , m (the number of 
one-way bridges), r (the index of the island you are 
initially on);
Make an 2D array called “ graph_matrix ” in size of [ 
n+1 ] to store the connections between islands 
(store the edge (bridges) between isalnds );
//Make for loop read x ( first island ) ,y( second 
island ) to store the connections between islands in 
2D array .
// for loop to store number of bridges in 2D array . 
For (I = 0; I < m ; i++ ){
Read x ( first island ) ,y( second island );
// put 1 in the index where x and y intersect .
graph_matrix [ x ][ y ]=1;
}
Take an object (h) from class TopologicalSorting;
Make an array called “ a ” ;
Call method “ topological ” that take array “ 
graph_matrix ” and r “ the index of the island you 
are initially on ” that method sort the array “ 
graph_matrix ” that method sort bridges ;
// Topological sorting “ if there depancy between 
nodes we can write nodes in somehow While 
maintaining dependency ” , it for Directed Acyclic 
Graph “ DAG ” linear ordering of vertices such that 
for every directed edge( u , v ) u must come before 
v .
Read a = h.topological( graph_matrix , r );
// after sorting “ graph matrix “ in topological way 
we store result from topological method in array “ a 
” after sorting .
// for loop to print the island he will stuck on .
For (I = 0 ; I < a.length-1 ; i++ ){
If ( a[ i ] != 0 ) 
Print ( "the island he will stuck on : " + a[i] );
}

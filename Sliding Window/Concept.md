Sliding window is a technique to solve array and string problems

How to determine whether sliding window is applied Or not !

So, in the input we have an array and a string with a value which is given and some condition is applied on that particular value. And that condition can be like that : value should be max or min.
And in the output we want a subarray Or a substring.

Hence , when in the input we have an array , k and in the output we want a subarray and some condition is applied on that subarray then Sliding Window is applied.


Types Of Sliding Window

        Fixed size Sliding Window
        Variable size Sliding Window


First lets see fixed size Sliding Windoww


Ex : Array : {2 , 1 , 3 , 5 , 1 , 2 , 1 , 7 , 8 , 2 , 4} and k = 3 (Given)
Find the k size Subarray whose sum is maximum.


Step-1 : Identifying whether sliding window can be applied on this problem or not.

Since, Array is given and a value is also given here i.e k = 3 and
some condition is also applied on the subarray. Hence, it is a problem of
Sliding window.

Step-2 : If sliding window is applied then , check which type of Sliding window we should use here.

Here size of the subarray is fixed i.e k size hence , we will use Fixed size sliding window.


Step-1 : Identifying whether sliding window can be applied on this problem or not.

-----------> Since, Array is given and a value is also given here i.e k = 3 and
some condition is also applied on the subarray. Hence, it is a problem of
Sliding window.

Step-2 : If sliding window is applied then , check which type of Sliding window we should use here.

----------> Here size of the subarray is fixed i.e k size hence , we will use Fixed size sliding window.


Applying fixed size sliding window on the above array with k = 3 to get the maximum sum subarray.


        Step - 1:
        
        maxSum = 0
        
        {2  ,    1  ,    3  , 5 , 1 , 2 , 1 ,  7 , 8 , 2 , 4}
         |                |
         ------------------
                 |
        First k = 3 size window
        
        So, maxSum = 2 + 1 + 3 => 6 <---- After taking first 'k' sized window into the consideration.
        
        
        Step - 2:
        
        {2 ,  1 ,     3 ,        5 , 1 , 2 , 1 ,  7 , 8 , 2 , 4}
              |                  |
              --------------------
                      |
              Now, 5 will be added to the previous sum
              and 2 will be deducted. Since , curr_window contains , 1 , 3 and 5
        
        maxSum = max (maxSum , 1 + 3 + 5) ==> So, maxSum = 9
        
        
        Step - 3:
        
        {2 ,  1 ,   3 ,      5 ,       1  , 2 , 1 ,  7 , 8 , 2 , 4}
                    |                  |
                    --------------------
                             |
                    Now, 1 will be added to the previous sum
                    and 1 will be deducted. Since , curr_window contains , 3 , 5 and 1
        
        maxSum = max (maxSum , 3 + 5 + 1) ==> So, maxSum = 9


Variable size Sliding Window


If the Window Size cant be fixed due to constarints of problem then it is called variable size Sliding window



























Lets discuss How to identify Fixed and variable size Window

In a fixed window problem, we have a predefined window size that remains constant throughout the problem-solving process.
The template for solving a fixed window problem involves maintaining two pointers, low and high, that represent the indices of the current window.
The process involves iterating over the array or sequence, adjusting the window as necessary.

fixed_window()
{
    int low = 0, high = 0, windowsize = k;
    while (i < sizeofarray)
    {
        // Step 1: Create a window that is one element smaller than the desired window size
        if (high - low + 1 < windowsize)
        {
            // Generate the window by increasing the high index
            high++;
        }
        // Step 2: Process the window
        else
        {
            // Window size is now equal to the desired window size
            // Step 2a: Calculate the answer based on the elements in the window
            // Step 2b: Remove the oldest element (at low index) from the window for the next window

            // Proceed to the next window by incrementing the low and high indices
        }
    }
}





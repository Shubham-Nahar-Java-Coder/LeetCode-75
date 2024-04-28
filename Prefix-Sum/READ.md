# LeetCode-75

This repository contains Prefix Sum problems only of Easy level.

## Easy: 
1. [Find the Highest Altitude](https://github.com/Shubham-Nahar-Java-Coder/Leetcode-75/tree/master/Prefix-Sum/Find-the-Highest-Altitude)
2. [Find Pivot Index](https://github.com/Shubham-Nahar-Java-Coder/Leetcode-75/tree/master/Prefix-Sum/Find-Pivot-Index)

## Notes:

I've prepared some notes on Prefix Sum. It's beneficial to review them before diving into the problem statements and solutions. This understanding will facilitate easier issue resolution and clearer comprehension.

## Prefix Sum:

 - Prefix sum, also known as **Cumulative Sum**, is a technique used in programming to efficiently calculate the sum of elements in a contiguous subarray of an array.

 - This technique is often used in scenarios where there are **multiple queries to find the sum of elements** within various subarrays of a given array.

 ## Prefix Sum in Layman's Terms:

 - Imagine you have a list of numbers, like [1, 2, 3, 4, 5]. Now, say you want to know the sum of the numbers from the beginning up to a certain point. 
 - For instance, the sum of the numbers from the start to the third number **(1 + 2 + 3)**, or the sum of the numbers from the start to the fifth number **(1 + 2 + 3 + 4 + 5)**.

 - **Prefix sum helps us quickly answer these types of questions without having to add up all the numbers each time.**
 - It does this by **pre-calculating the sum** of numbers up to each position in the list and storing these sums in another list. So, for our example **list [1, 2, 3, 4, 5]**, the **prefix list** would look like **[1, 3, 6, 10, 15]**. 

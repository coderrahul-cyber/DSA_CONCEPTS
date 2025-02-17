# Arrays in Java

## Description
An array is a data structure that stores a fixed-size sequential collection of elements of the same type. Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value. In Java, arrays are objects that can hold primitive types or references to objects.

## Creating an Array
To create an array in Java, you need to define the type of elements it will hold and specify its size. Here is an example of how to create an array:

```java
// Declare an array of integers
int[] numbers;

// Allocate memory for 5 integers
numbers = new int[5];

// Alternatively, you can declare and allocate in one statement
int[] numbers = new int[5];
```

## Initializing an Array
You can initialize an array at the time of declaration using an array initializer:

```java
int[] numbers = {1, 2, 3, 4, 5};
```

## Updating an Array
To update an element in an array, you need to access the element by its index and assign a new value:

```java
// Update the first element (index 0) to 10
numbers[0] = 10;

// Update the third element (index 2) to 30
numbers[2] = 30;
```

## Accessing Array Elements
You can access elements in an array using their index:

```java
// Access the first element
int firstNumber = numbers[0];

// Access the third element
int thirdNumber = numbers[2];
```

## Example
Here is a complete example demonstrating array creation, initialization, updating, and accessing elements:

```java
public class ArrayExample {
    public static void main(String[] args) {
        // Create and initialize an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Update elements in the array
        numbers[0] = 10;
        numbers[2] = 30;

        // Access and print elements in the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);
    }
}
```
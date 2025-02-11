# Simple Pattern Algorithm

To print a simple pattern, such as a right-angled triangle of stars, you can use the following algorithm:

1. **Initialize**: Start by initializing the number of rows for the pattern.
2. **Loop through rows**: Use a loop to iterate through each row.
3. **Print stars**: For each row, use a nested loop to print the required number of stars.
4. **New line**: After printing stars for a row, move to the next line.

## Java Code

```java
public class SimplePattern {
    public static void main(String[] args) {
        int n = 5; // number of rows
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

## Explanation

- `n` is the number of rows in the pattern.
- The outer loop runs from `1` to `n` (inclusive) to handle the number of rows.
- The inner loop runs from `0` to `i-1` to print the stars in each row.
- `System.out.print('* ');` prints a star followed by a space, and `System.out.println();` moves to the next line after each row.

This will produce the following output for `n = 5`:

```
* 
* * 
* * * 
* * * * 
* * * * * 
```
### FOR INVERTED :
 
1. **Initialize**: Start by initializing the number of rows for the pattern.
2. **Loop through rows**: Use a loop to iterate through each row.
3. **Print stars**: For each row, use a nested loop to print the required number of stars by giving it the value of the number of rows.
4. **New line**: After printing stars for a row, move to the next line.


### FOR HOLLOW PATTERNS
1. **Initialize**: Start by initializing the number of rows for the pattern.
2. **Loop through rows**: Use a loop to iterate through each row.
3. **Print stars**: For each row, use a nested loop to print the required number of stars __With conditon that only print the star if the i =0 or i=n-1 or j=1 or j=n.
4. **New line**: After printing stars for a row, move to the next line.
   
### Rhombus Star patterns
1. **Initialize**: Start by initializing the number of rows for the pattern.
2. **Loop through rows**: Use a loop to iterate through each row.
3. **Print the WhiteSpace**:add a nested loop in which the whitespace will print as condition with intialize  with the j=1 print till j<=i 
4. **Print stars**: For each row, use a nested loop to print the required number of stars by giving it the value of the number of rows.
5. **New line**: After printing stars for a row, move to the next line.
   
### Mirrored Star Pattern

1. **Initialize**: Start by initializing the number of rows for the pattern.
2. **Loop through rows**: Use a loop to iterate through each row.
3. **Print spaces**: For each row, use a nested loop to print the required number of spaces.
4. **Print stars**: After printing spaces, use another nested loop to print the required number of stars.
5. **New line**: After printing stars for a row, move to the next line.

### Pyramid Star Pattern

1. **Initialize**: Start by initializing the number of rows for the pattern.
2. **Loop through rows**: Use a loop to iterate through each row.
3. **Print spaces**: For each row, use a nested loop to print the required number of spaces.
4. **Print stars**: After printing spaces, use another nested loop to print the required number of stars.
5. **New line**: After printing stars for a row, move to the next line.

### Reversed Mirrored Half Pyramid

1. **Initialize**: Start by initializing the number of rows for the pattern.
2. **Loop through rows**: Use a loop to iterate through each row.
3. **Print spaces**: For each row, use a nested loop to print the required number of spaces.
4. **Print stars**: After printing spaces, use another nested loop to print the required number of stars.
5. **New line**: After printing stars for a row, move to the next line.

### Inverted Half Pyramid with Numbers

1. **Initialize**: Start by initializing the number of rows for the pattern.
2. **Loop through rows**: Use a loop to iterate through each row.
3. **Print numbers**: For each row, use a nested loop to print the required numbers starting from 1 up to the current row number.
4. **New line**: After printing numbers for a row, move to the next line.

### Floyd's Triangle

1. **Initialize**: Start by initializing the number of rows for the pattern and a counter starting from 1.
2. **Loop through rows**: Use a loop to iterate through each row.
3. **Print numbers**: For each row, use a nested loop to print the required numbers, incrementing the counter after each number.
4. **New line**: After printing numbers for a row, move to the next line.
   
### Butterfly Star Pattern

1. **Initialize**: Start by initializing the number of rows for the pattern.
2. **Upper half**: Use a loop to iterate through the first half of the rows.
    - **Print stars**: For each row, use a nested loop to print stars from the start to the current row number.
    - **Print spaces**: Use another nested loop to print spaces in the middle.
    - **Print stars**: Use another nested loop to print stars from the current row number to the end.
    - **New line**: Move to the next line after printing stars and spaces for a row.
3. **Lower half**: Use a loop to iterate through the second half of the rows.
    - **Print stars**: For each row, use a nested loop to print stars from the start to the current row number.
    - **Print spaces**: Use another nested loop to print spaces in the middle.
    - **Print stars**: Use another nested loop to print stars from the current row number to the end.
    - **New line**: Move to the next line after printing stars and spaces for a row.

### Diamond Pattern

1. **Initialize**: Start by initializing the number of rows for the pattern.
2. **Upper half**: Use a loop to iterate through the first half of the rows.
    - **Print spaces**: For each row, use a nested loop to print the required number of spaces.
    - **Print stars**: Use another nested loop to print the required number of stars.
    - **New line**: Move to the next line after printing spaces and stars for a row.
3. **Lower half**: Use a loop to iterate through the second half of the rows.
    - **Print spaces**: For each row, use a nested loop to print the required number of spaces.
    - **Print stars**: Use another nested loop to print the required number of stars.
    - **New line**: Move to the next line after printing spaces and stars for a row.
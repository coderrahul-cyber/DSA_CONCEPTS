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
   


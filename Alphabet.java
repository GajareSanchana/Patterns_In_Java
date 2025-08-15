// Alphabet S
public class Alphabet {
            public static void main(String[] args) {
            int height = 5;  // Height of the 'S' pattern (can be adjusted)
            
            // Outer loop to control rows
            for (int i = 1; i <= height; i++) {
                // Top, middle, and bottom rows
                if (i == 1 || i == height / 2 + 1 || i == height) {
                    // Print a full row of stars when i is 1, height/2 + 1, or height
                    for (int j = 1; j <= 5; j++) {
                        System.out.print("*");  // Print five '*' in a row
                    }
                }
                // Rows between top and middle
                else if (i <= height / 2 + 1) {
                    // Print a single star on the left side
                    System.out.print("*");
                }
                // Rows between middle and bottom
                else {
                    // Print spaces to create right-side alignment
                    for (int j = 1; j < 5; j++) {
                        System.out.print(" ");  // Print spaces
                    }
                    // Print a star on the right side
                    System.out.print("*");
                }
                // Move to the next line after each row
                System.out.println();
            }
        }
    }

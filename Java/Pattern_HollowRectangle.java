public class Pattern_HollowRectangle {
  public static void main(String[] args) {
      int rows = 4;    // Number of rows
      int columns = 5; // Number of columns

      // Outer loop for rows
      for (int i = 0; i < rows; i++) {
          // Inner loop for columns
          for (int j = 0; j < columns; j++) {
              // Print '*' on the boundary (top, bottom, left, or right)
              if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
                  System.out.print("*");
              } else {
                  System.out.print(" ");
              }
          }
          // Move to the next line
          System.out.println();
      }
  }
}


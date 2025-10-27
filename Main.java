import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    printNTimes()
  }

  public static void printNTimes(String word, int N)
  {
    for (int row = 1; row <= 10; row++)
        {
            for (int col = 1; col <= row; col++)
            {
                System.out.print(word.substring(0,N) + word);
            }
            System.out.println();
        }
  }

  public static void printNums()
  {
    // code solution here
  }

  public static void uprightNumberTriangle(int N)
  {
    // code solution here
  }

  public static void starTree()
  {
    // code solution here
  }

  public static void multTable()
  {
    // code solution here
  }
}

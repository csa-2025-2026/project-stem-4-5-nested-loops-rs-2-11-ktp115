import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Input a number:");
    int num = sc.nextInt();

    uprightNumberTriangle(num);
    printNTimes("code",3);
    printNums();
  }

  public static void printNTimes(String word, int N)
  {
    for (int index = 0; index < word.length(); index++) // for each letter
    {
      for (int output = 0; output < N; output++) // each letter print out N times
      {
          String letter = word.substring(index,index+1); // get the letter
          System.out.print(letter); //print out the letter
      }
    }
  }

  public static void printNums()
  {
    for (int row = 10; row > 0; row--) //start at 10 and go down
    {
      for (int col = 0; col < row; col++) // prints out 1 num then next and next until done
      {
        System.out.print(row + " ");
      }
      System.out.println();
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    for (int row = 1; row <= N; row++) //1 to input num
    {
      for (int number = 1; number <= row; number++) //1 to current row num
      {
        System.out.print(number + " "); //prints the first num, then next adds, blah blah
      }
      System.out.println();
    }
  }

  public static void starTree()
  {
    for (int row = 10; row > 0; row--)
    {
      for (int i = 10; i > 0; i--)
      {
        System
      }
    }
  }

  public static void multTable()
  {
    // code solution here
  }
}

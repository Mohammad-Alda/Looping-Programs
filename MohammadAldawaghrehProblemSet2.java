import java.util.Scanner;

public class MohammadAldawaghrehProblemSet2
{
    static Scanner sc;
    //calculates the standard deviation based on a list of values inputted by user
    public static void standardDeviation()
    {
      Scanner sc = new Scanner ( System.in );
      
      int instances;
      double value, total = 0, totalSquare = 0, SD, average, avg2, avgSquare;
      
      //asks for number of values user wants to input
      System.out.println("How many numbers would you like to enter: ");
      instances = sc.nextInt();
      
      System.out.println("Input numbers: ");
      
      //initiates loop that stops when the counter reaches the number of values that the user wants to enter
      for (int i = 0; i < instances; i++)
      {
          //calculates the total and totalsquare using Math.pow
          value = sc.nextDouble();
          total += value;
          totalSquare += Math.pow(value, 2);
      }
      
      //calculates the averages and standard deviation value
      average = total/instances;
      avg2 = Math.pow(average,2 );
      avgSquare = totalSquare/instances;
      SD = Math.sqrt(avgSquare - avg2);
      
      //outputs the calculation on the screen
      System.out.println("\navg = " +  total + "/" + instances + " = " +  average);
      System.out.println("avg^2 = " + avg2);
      System.out.println("\navgSquare = " + totalSquare + "/" + instances + " = " +avgSquare);
      System.out.println("\nSD = Math.sqrt( " + avgSquare + " - " + avg2 + " ) = Math.sqrt( " + (avgSquare-avg2) + " ) = " + SD);
      System.out.println();

    }
    
    //finds the sum of squares and cubes from 1 all the way to the value inputted by the user
    public static void squaresAndCubes()
    {
       Scanner sc = new Scanner ( System.in );
       
       int limit, sumSquare = 0, sumCube = 0;
       
       //asks for the limit
       System.out.println ("Upper limit: ");
       limit = sc.nextInt();
       
       //initiates loop that stops when the limit is reached
       for (int i = 1; i <= limit; i++)
       {
           //calculates the sum of squares and cubes using Math.pow
           sumSquare += Math.pow (i, 2);
           sumCube += Math.pow (i, 3);
       }
       
       //outputs the values
       System.out.println("The sum of Squares is " + sumSquare);
       System.out.println("The sum of Cubes is " + sumCube);
       System.out.println("");
    }

    //calculates miles per gallon
    public static void milesPerGallon()
    {
      Scanner sc = new Scanner ( System.in );
      
      int imiles, fmiles;
      double gallons, mpg;
      
      //asks for initial miles from user BEFORE loop is initiated in order to create a loop using the imiles value
      System.out.println("\nMiles Per Gallon Program");
      System.out.println("Initial Miles: ");
      imiles = sc.nextInt();
      
      //initiates loop that stops if imiles is less than or equal to 0
      while( imiles >= 0 )
      {
          System.out.println ("Final Miles: ");
      fmiles = sc.nextInt();
            
      System.out.println("Gallons: ");
      gallons = sc.nextDouble();
      
      //calculates the miles per gallon
          mpg = (fmiles-imiles)/gallons; 
      System.out.println("Miles per Gallon: " + mpg);
        
      System.out.println("\n\nInitial Miles: ");
      imiles = sc.nextInt();
      }
      System.out.println("bye");
      System.out.println();
    }
        
      public static void areaOfRectangle()
    {
       int xCrd1, xCrd2, yCrd1, yCrd2, width, height, area; 
       
       System.out.println ("Computer Aided Design Program");
        
       //initiates loop that terminates if area is equal to zero
       do
       {
           //prompts user for coordinates
           System.out.println("First X Coordinate: ");
           xCrd1 = sc.nextInt();
           
           System.out.println("First Y Coordinate: ");
           yCrd1 = sc.nextInt();
           
           System.out.println("Second X Coordinate: ");
           xCrd2 = sc.nextInt();
           
           System.out.println("Second Y Coordinate: ");
           yCrd2 = sc.nextInt();
           
           //using Math.abs to retreive the absolute values of the widths and heights in order to properly calculate the area of the rectangle 
           width = Math.abs(xCrd2 - xCrd1);
           height = Math.abs(yCrd2 - yCrd1);
           area = width * height;
           
           System.out.println("Width: " + width + " Height: " + height + " Area: " + area);
           System.out.println();
       }
       while(area != 0);
       {
           System.out.println("Finished");
           System.out.println();
       }
       
    }
    

    //calculates the amount of months that takes for a drug to drop below 50% potency
        public static void drugPotency()
    {
        double percent = 100.0;
        int month = 0;
        
        System.out.print("Month:" + month + "   Effectiveness: ");
        System.out.format("%.2f%n", percent);
        
        do
        {
            // increase the month by 1 each loop and subtracts 4% 
            month ++;
            percent = percent - (percent*0.04);
            System.out.format("%-10s%s","Month:"+ month, "Effectiveness: ");
            System.out.format("%.2f%n", percent);
        }
        while(percent >= 50);
        System.out.println("DISCARDED");
        System.out.println();
    }

    //calculates the hail stone number sequence
    public static void hailStoneNumbers()
    {
       int value, numOfChanges = 1, maxNumber;
       
       System.out.print ("Enter an integer: ");
       value = sc.nextInt();
       maxNumber = value;
       
       //initiates loop that stops when the number reaches 1, which is the goal
       while (value != 1)
       {
           //checks if the number entered and the numbers to follow are even and divides by 2 
           if ( value % 2 == 0 )
           {
               //formats the output properly in order to have them properly lined up
               System.out.format ("%-5s%s",value, "     (even, next value is "+ value + "/2)\n");
               value /= 2;
           }
           else // if value is not even, it will be odd
           {
               System.out.format ("%-5s%s",value, "     (odd, next value is 3*"+ value + "3+1)\n");
               value = 3 * value + 1;
           }
           if ( value == 1) // if value reaches one, the following is outputted
           {
               System.out.format ("%-5s%s",value, "     (stop calculation)");
           }
           //calculates the maximum number in the sequence
           if ( value > maxNumber)
           {
               maxNumber = value;
           }
           //tracks length of sequence using a counter
           numOfChanges ++;
       }
       System.out.println();
       System.out.println("\nThe length of the sequence is " + numOfChanges);
       System.out.println("\nThe maximum number of the sequence is " + maxNumber);
       System.out.println();
       
    }
    
    
    
 public static void main (String[] args)
    {
        sc = new Scanner (System.in); 
        int choice;
        do
        {
            System.out.println ("Problem Set #2");
            System.out.println ("--------------");
            System.out.println ("1. Standard Deviation");
            System.out.println ("2. Squares And Cubes");
            System.out.println ("3. Miles Per Gallon");
            System.out.println ("4. Area Of Rectangle");
            System.out.println ("5. Drug Potency");
            System.out.println ("6. Hail Stone Numbers");
            System.out.println ("0. Quit");
            choice = sc.nextInt();

            if (choice == 1)
                standardDeviation(); 
            else if (choice == 2)
                 squaresAndCubes(); 
            else if (choice == 3)
                milesPerGallon();
            else if (choice == 4)
                areaOfRectangle();
            else if (choice == 5)
                drugPotency();
            else if (choice == 6)
                hailStoneNumbers();

        }
        while (choice != 0); // exit when 0   
        System.out.print('\u000c');
    } // main method
} // ProblemSet4 class
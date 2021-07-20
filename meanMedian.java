import java.util.Scanner;

public class meanMedian
{
   public static void main(String[] args)
  {
    Scanner value = new Scanner(System.in);
	
	String message = "Enter Five numeric Values";
	String message1="Enter Value: "; 
	int count = 0;
	int[] numbers = new int[5];
	int temp = 0;
	double mean=0; 
	int numTot = 0;
	int median=0;
	
	System.out.println(message);
	for(int x=0;x<numbers.length;x++)
	{
	  count++;
       System.out.println(message1+""+count);
      numbers[x] = value.nextInt();
      numTot += numbers[x];
	}
		
    for (int x=0;x<numbers.length-1;x++)
	{
		 for(int y=0;y<numbers.length-1;y++)
		 {
			 if (numbers[x]>numbers[x+1])
			 {
				 temp = numbers[x];
				 numbers[x] = numbers[x+1];
				 numbers[x+1] = temp;
			 }	 
		 }
	 
	}		
	
	
   
	    mean = numTot/count;
	    median = numbers[2];
	  
        System.out.println("The following are numbers prompted for: ");
        System.out.println(" "); 
        for(int x=0;x<numbers.length;x++)
		 {
		   System.out.println(numbers[x]+"\n");
		 }	   
	  System.out.println(" ");
	  System.out.println("The Mean is: "+" "+mean);
	  System.out.println("   ");
	  System.out.println("the Median is "+median);
	
  }
}
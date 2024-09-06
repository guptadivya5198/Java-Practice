
 public class Annotations
{
    public static void main(String args[])
    {
    
      int i = 9;
      int j= 0;
      int nums[] = new int[5];
       
      try
      {
        j = 18/i;
        System.out.println(j);
        System.out.println(nums[1]);
        System.out.println(nums[5]);
      }
      catch(ArithmeticException e)
      {
        System.out.println("can not divide by zero"); 
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
        System.out.println("Stay in Your Limit..");
      }
    catch(Exception e)
    {
        System.out.println("Something went wrong.." + e);
    }
    
      
      System.out.println("bye");
        

    }
}
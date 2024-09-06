// class Computer
// {
//     public int add(int n1, int n2 , int n3)
//     {
//         return n1+ n2 +n3;
//     }

//    public int add(int n1, int n2) 
//    {
//     return n1+ n2;
//    }
// }

// public class Demo 
// {
//     public static void main(String a[])
//     {
//         Computer obj =new Computer();
//         int r1= obj.add(3,4,5 );
//         System.out.println(r1);
//     }
// }


// array
//  public class Demo{
//     public static void main( String a[])
//     {
//         // int nums[] = {3,4,5,2};
//         int nums[] = new int[4];
//         nums[0] = 1;
//         nums[1] = 3;
//         nums[2] = 4;
//         nums[3] = 5;

//         for(int i =0; i<4; i++)
//         {
//         System.out.println(nums[i]);
//         }
//     }
//  }

// md array
  public class Demo{
    public static void main(String a[])
    {
        int nums [] [] [] = new int[3][4][2];
      
        for(int i =0; i<3; i++)
        {
            for(int j=0; j<4; j++)

            {
                for(int k =0; k<2; k++)
                {
                    nums[i][j][k] = (int)(Math.random() * 10);
                }
            }

        }
        for(int i =0; i<3; i++)
        {
            for(int j=0; j<4 ; j++)
            {
                for(int k=0; k<2; k++)
                {
                    System.out.print(nums[i][j][k] + " " );
                }
            }
            System.out.println();
        }

                // enhanced for loop
        // for(int n[] : nums )
        // {
        //    for( int m: n) 
        //    {
        //     System.out.print(m + " ");
        //    }
        //    System.out.println();
        // }

    }
  }

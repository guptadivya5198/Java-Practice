public class Testing {
    public static void main(String a[])
      {
        int N=0;
        if(int N%2!=0){
            System.out.println("Weird");
        }
        else if(int N%2==0 && N>=2 && N<6){
            System.out.println("Not Weird");
        }
        else if(int N%2==0 && N>=6 && N<21 ){
            System.out.println("Weird");
        }
        else( int N%2==0 && N>20){
            System.out.println("Not Weird");  
        }
          
    }

    
}

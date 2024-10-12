public class Countnums {
    public static void main(String[] args) {
        int n = 44445353;
        int count =0;
        while(n >0){
            int rem = n%10;
            if(rem ==40){
                count++;
            }
            n = n/10;
        }
            System.out.println(count);
    }
}

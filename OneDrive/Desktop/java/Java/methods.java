    
    class Computer
    {
       public void playMusic()
        {
            System.out.println("Playing Music");
        }
       public String getMeAPen(int cost)
       {
            if(cost >= 10)
            return "Pen";
            else
            return "Nothing";
       }
    }

    public class methods
    {
        public static void main(String a[])
        {
            Computer obj =new Computer();
            obj.playMusic();
            String str =  obj.getMeAPen(15);
            System.out.println(str);

        }
    }

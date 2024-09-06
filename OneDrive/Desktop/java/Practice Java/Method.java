class Caluclator
{
    public String getMeAPen(int cost)
         {
            if (cost>=10)
             return "Pen";

            else
             return "Nothing";

         }
     public void playMusic()
     {
        System.out.println("playing music");
     }

}

public class Method
{
    public static void main(String a[])
    {
        Caluclator obj = new Caluclator();
        obj.playMusic();
        // obj.getMeAPen(12);
        String str  = obj.getMeAPen(12);
        System.out.println(str);

    }
}
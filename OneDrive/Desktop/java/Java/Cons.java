
 class Human
 { 
    private int age;
    private String name;

    public Human()
    {
        age = 24;
        name= "Prateek";
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int a)
    {
        this.age = a;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        this.name  =n;
    }


 }
public class Cons 
{
   public static void main(String a[])  
   {

    Human obj = new Human();
    System.out.println(obj.getName() + " : " + obj.getAge());

    // obj.setAge(22);
    // obj.setName("Divya");

    // System.out.println(obj.getName() + " : " + obj.getAge());

   } 
}



class Mobile
{
   String brand;
   int price;
    static String name; 
   
   public void show()
   {
    System.out.println(brand + " : " + price + " : " + name );
   }
}
public class Deemo 
{
    public static void main(String[] a)
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price =1500;
        Mobile.name = "Smartphone";


        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price =1700;
        Mobile.name = "Smartphone";
        

        // obj1.name = "Phone";

        obj1.show();
        obj2.show();

        // static varible should be called  with their class name not by the objects 

    }
    
}

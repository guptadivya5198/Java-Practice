

public class string {
    public static void main(String[] a)
    {
        String name = new String("Divya");

        System.out.println("hello " + name);

        // name = name + "d ";

        // System.out.println(name.charAt(3));
        name = name + " ";
        System.out.println(name.concat(" Gupta"));

        StringBuffer sb = new StringBuffer("Papa");
        System.out.println(sb.capacity());
        System.out.println(sb.length()
        );
        sb.append(" jii");
        System.out.println(sb);
    }
}

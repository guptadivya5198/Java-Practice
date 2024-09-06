class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class Demmo {
    public static void main(String a[]) {
        // String name = new String("Divya");
        // System.out.println("hello " + name);
        // System.out.println(name.charAt(2));
        // System.out.println(name.concat(" Gupta"));

        // StringBuffer sb = new StringBuffer("divya");
        // sb.append(" gupta");
        // System.out.println(sb);
        Human obj = new Human();
        obj.setAge(14);
        obj.setName("Divya");

        System.out.println(obj.getName() + " " + obj.getAge());

    }
}
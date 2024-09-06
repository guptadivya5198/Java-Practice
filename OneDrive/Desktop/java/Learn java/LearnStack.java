  import java.util.Stack;

public class LearnStack {
    public static void main(String args[])
    {
        Stack <String> animals = new Stack();
        animals.push("Cat");
        animals.push("Dog");
        animals.push("Lion");
        animals.push("Monkey");

        System.out.println("Stack : "+ animals );

        animals.pop();  
        System.out.println("Stack : "+ animals );


        //peek function is use to see topmost element
        
        System.out.println(animals.peek());

        System.out.println("Stack : "+ animals );

        


    }
    
}

//  class Student
// {
//     int rollno;
//     String name;
//     int marks;

// }

// public class Learn
// {
//     public static void main(String a[])
//     {
//         Student s1 = new Student();
//         s1.rollno = 1;
//         s1.name = "Divya";
//         s1.marks = 78;

//         Student s2 = new Student();
//         s2.rollno = 2;
//         s2.name = "Divya Gupta";
//         s2.marks = 98;

//         Student s3 = new Student();
//         s3.rollno = 3;
//         s3.name = "Neha";
//         s3.marks = 68;

//         Student student[] = new Student[3];
//         student[0] =s1;
//         student[1] =s2;
//         student[2] =s3;

//        for(int i=0; i<student.length; i++)
//        {
//         System.out.println(student[i].rollno + " :-> " + student[i].name + " : "  + student[i].marks);
// //        }

//     }
// }

// class Calc
// {
//     public int add(int n1 , int n2)
//     {
//         return n1 + n2;
//     }

// }
// class AdvCalc extends Calc
// {
//     public int add(int n1, int n2)
//     {
//         return n1 + n2+ 1;
//     }
// }
// public class Learn{
//     public static void main(String a[])
//     {
//         Calc obj = new Calc();
//         int r1 = obj.add(3,4);
//         System.out.println(r1);
//     }
// }
// package test;
//     import test.AdvCalc;
//     import test.Calc;

//     class Calc
//     {
//        public int show1(int n1 , int n2) 
//        {
//            return n1 + n2;
//        }
//     }
//     class AdvCalc
//     {
//         public void show()
//         {
//             System.out.println("This is advclass");
//             return;
//         }
//     }
// class Learn
// {
//     public static void main(String a[])
//     {
//         Calc obj =new Calc();
//         int r = obj.show1(3,4);
//         System.out.println(r);
//         AdvCalc obj1 = new AdvCalc();
//         obj1.show();
//     }
// }

//                                     // polymorphism --run tym polymorphsim

// class A{
//     public void show()
//     {
//         System.out.println("in A show");
//         return;
//     }
// }
// class B extends A{
//     public void show()
//     {
//         System.out.println(" in B show");
//         return;
//     }
// }
// class C extends A{
//     public void show()
//     {
//         System.out.println(" in C show");
//         return;
//     }
// }

// class Learn
// {
//     public static void main(String a[])
//     {
//         A obj = new B();
//         obj.show();
//                                                 // Dynamic method dispacth/
//         // obj = new B();
//         // obj.show();

//         // obj = new C();
//         // obj.show();
//     }
// }

// final keyword
// final-- variable class method
//  class  A{                        
//     public  final void  show(){
//         System.out.println("in A");
//         return;
//     }
// }   
//  class B extends A {
//     public void  show(){
//         System.out.println("in B");
//         return;
//     }
//  }                                                
// class Learn{
//     public static void main(String[] args) {
//          A obj = new A();
//          obj.show();

//          B obj =new B();
//          obj.show();

//     }
// abstract keyword

//      abstract class Car
//      { 
//         public abstract void drive();
//         public abstract void fly();

//         public void playmusic(){
//             System.out.println("Playing Music");

//         }

//      }
//      abstract class Wagnor extends Car{

//         public  void drive()
//         {
//         System.out.println("Driving..");
//     }
// } 
//  class Updatewagnor extends Wagnor{                   //concrete class//
//     public void fly(){
//         System.out.println("flying");

//     }
//  }

//     class Learn{
//         public static void main(String a[])
//         {
//             Car obj = new Updatewagnor();
//             obj.drive();
//             obj.playmusic();
//             obj.fly();
//         }

//           } 
// class A {
//     int age;
//     public void show() {
//         System.out.println("in show a");

//     }

// }

// class Learn {
//     public static void main(String a[]) {
//         // anonymous class
//         A obj = new A() 
//         {
//             public void show() {
//                 System.out.println("in new show");

//             }
//         };
//         obj.show();

//     }
// }
 interface A{
    // declare variable
    int age =44;
    String area = "lucknow";  // final and static in interface by default


    // method declare
    void show();   
    void config();
 } 
 interface X{
        void run();
 }
interface Y extends X{

}
 
 class B implements A,Y{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("in run");
    }


 }
class Learn{
    public static void main(String a[]){
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.area);   
        // we can use variable in interface without object
        X obj1 = new B();
        obj1.run();

    }
}

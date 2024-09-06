

// // import java.util.*;

// // public class Test {
// //    static int k = 12;
// //     // public static void main(String[] a) {
// //     //     Scanner sc = new Scanner(System.in);
// //     //         System.out.println(k);

// //     //     // System.out.println("This is test class");

// //     //     // int[] array = new int[2];

// //     //     // int array1[]  = {1,2,3,2};
// //     //     // for(int i = 0; i<array1.length; i++)
// //     //     //             System.out.print(array1[i]);
// //     //     // for(int x:array1)

// //     //     // System.out.println(x);

// //     //     // int[][] twodarray = new int[2][3];
// //     //     // twodarray[0][0] = 12;
// //     //     // twodarray[1][2] = 10;
// //     //     // for(int i = 0; i<twodarray.length;i++){
// //     //     //     for(int j = 0; j<twodarray[0].length ; j++){
// //     //     //             System.out.println(twodarray[i][j]);
// //     //     //     }
// //     //     // }

// //     //     // for(int[] array2:twodarray){
// //     //     //     for(int value:array2){
// //     //     //         System.out.println(value);
// //     //     //     }
// //     //     // }

// //     //     // *
// //     //     // **
// //     //     // ***

// //     //     // for(int i = 4; i>=1; i--){
// //     //     //     // for(int j = 1;j<=i ;j++){
// //     //     //     //     System.out.print("* ");
// //     //     //     // }
// //     //     //     for(int j = i;j>=1  ;j--){
// //     //     //         System.out.print("* ");
// //     //     //     }
// //     //     //     System.out.println();
// //     //     // }

// //     //     ///  class and object

// //     //     // Class:>>> description of object is called class
// //     //     // Object:>> Intance of the class

// //     //     sum();

// //     // }

// //     public static void main(String[] args) {
// //     // Animal cat  =     new Animal(4,1,2);
// //     //     // Animal cat1 = new Animal(4,1,2);
// //     //     // System.out.print(cat.legs);

// //     // }

// //     new Animal().printDescription(); /// anonymous object

// //     /// polymorphism  >>> multiple forms

// //       // compile time polymorphism  ===> method overloading
// //     //  sum(12,10);
// //     //  sum(1,2,3);

// //     }

// //     static void sum(int a, int b){
// //         System.out.println(a+b);
// //     }

// //     static void sum(int a, int b,int c){
// //         System.out.println(a+b+c);
// //     }

// // }

// // // this is other class
// //  class Animal {
// //     int legs;  // instance variable
// //     int tail;
// //     int eyes;

// //     // constructor
// //     Animal(int legs,int tail,int eyes){   // local variable
// //         System.out.println("This is run at"+legs);
// //         this.legs = legs;
// //         this.tail = tail;
// //         this.eyes =eyes;
// //     }

// //     Animal(){}

// //     public void printDescription(){
// //         System.out.println("This is legs"+legs+"tail"+tail+"eyes"+eyes);
// //     }
// // }

// // package test;

// // public class Test {
// //     public static void main(String[] args) {
//         // A a = new A();
//         // B b = new B();

//         // C c = new C();

//         // c.print();

//         // B b = new B();

//         // A a = new A();
//         // a.print();

//         // new A().print();
//     //     A.print();
//     // System.out.println(A.a);

//     // A obj =  new A();
//     // // System.out.println(obj.getA(12));
//     // obj.setA(100);
//     // System.out.println(obj.getA(12));
//     // C c = new  C();
//     // c.des();\
//     // F f = new F();
//     // f.print1();

// //    B b = new B();
// //    b.print();

// // B b = new B();
// // b.print();

//         // A a = new A(){
//         //    @Override
//         //    public void print() {
//         //     System.out.println("THis is print function");
//         //    }
//         //    public void des() {
//         //     System.out.println("THis is des function");
//         //    }
//         // };

//         // a.print();
//         // a.des();

// //         B b = new B(){
// //             @Override
// //             public void print() {
// //               System.out.println("This is print function");
                
// //             }
// //         };
// //         b.print();
      
// // }
// // }

// // interface A{
// //    final int a  = 12;
// //     public void print();
// //     public void des();
// // }

// // abstract class B{
// //   public  abstract void print();
// // }



// // class B implements A{
// //     @Override
// //     public void print(){
// //         System.out.println("This is override function");
// //     }
// // }

// // abstract class A{
// //     public  void print(){
// //         System.out.println("This is print function");
// //     }
// //     public abstract void des();

// // }

// // class B extends A{

// // }


// // interface A{
// //     public void print1();
// // }
// // interface B{
// //     public void print2();
// // }
// // interface C extends A,B{
// //     public void print3();
// // }

// // abstract class D implements C{
// //     public void print1(){
// //         System.out.println("This is print 1");
// //     }
// //     public void print2(){
// //         System.out.println("This is print 2");

// //     }
// // }

// // abstract class E extends D{
// //     public void print3(){
// //         System.out.println("This is print 3");

// //     }
// // }

// // class F extends E{

// // }





// interface A{
//     public abstract void print();
// }

// interface B{
//     public abstract void print();
//     public abstract void des();
// }

// class C implements A,B{
     
//     @Override
//     public void print(){
//         System.out.println("THis is print function");
//     }

//     @Override
//     public void des(){
//         System.out.println("THis is print function");
//     }
// // }


// // class A{
// //   // access modifiers
// //  private int a =12;
// //  private  int b =13;



// //  // gater and setter
        
// //  public int getA(int value){
// //    if(value == 12) return a;
// //    return 0;
// //  }
// //  public int getB(){
// //     return b;
// //  }

// //  public void setA(int a){
// //    this.a = a;
// //  }
// //  public void setB(int b){
// //     this.b = b ;
// //   }
   
// // }



// class A{
//     A(){
//         System.out.println("This is construcctoar a");
//     }

//     A(int a){
//         this(12,34);
//         System.out.println("THis is parametrised constructor");
//     }
//     A(int b,int a){
//         this();
//         System.out.println("THis is parametrised constructor");
//     }
// }

// class B extends A{
//     B(){
//         super(12);
//         System.out.println("This is constructor b");
      
//     }
// }
// public class Test{
// public static void main(String a[])
// {

//   B obj = new B();
// }
// }






// // // multiple inheritance
// // class A {
// //     public void print() {
// //         System.out.println("THis is class A");
// //     }
// // }


// // class B  {
// //     public void print() {
// //         System.out.println("THis is class B");
// //     }
// // }
// // // ye ham log achieve nhi kar payenge
// // class C extends B {
// //     // public void print() {
// //     //     System.out.println("This is class C");
// //     // }
// // }



// // below example is single and multilevel inheritance

// class A {
//   public int add(int n1 , int n2) {
//     return n1 + n2;
//     }
// }


// class B extends A {
//     public int sub(int n1 , int  n2) {
//        return n1 - n2;
//     }
// }

// class C extends B {
//   public int multi(int n1 , int n2) {
//     return n1 * n2;
//     }
// }
// class D extends C {
//   public int div(int n1 , int n2) {
//     return n1/n2;
//     }
// }
// class Test{
//   public static void main(String a[])
//   {
//     D obj = new D();
//     int r1 = obj.add(3,4);
//     int r2 = obj.sub(9,4);
//     int r3 = obj.multi(3,4);
//     int r4 = obj.div(20,4);
//     System.out.println(r1 + " " + r2 + " " +  r3 + " "+ r4);
//   }
// }
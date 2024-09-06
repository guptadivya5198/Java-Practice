
class Student{
    //these aree instance variable because they belongs to a class not to a method

    int rollno;
    String name;
    int marks;
    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
    }

}



public class ArrayOfObject {
  
public static void main(String[] args)
{
    // create student object

    Student s1 = new Student();
    s1.rollno = 1;
    s1.name =  "Divya";
    s1.marks= 87;

    Student s2 = new Student();
    s2.rollno = 2;
    s2.name =  "neha";
    s2.marks= 89;

    Student s3 = new Student();
    s3.rollno = 3;
    s3.name =  "Shivika";
    s3.marks= 88;

    // create array of students

    Student students[] = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    // for print all the details of student

    // for(int i=0; i<students.length; i++)
    // {
    //     System.out.println(students[i].name + " :  " + students[i].marks);
    // }


    // enhanced for loop or for each loop
    for(Student stud : students)
    {
        System.out.println(stud.name + ":"  +  stud.marks);
    }

}


}


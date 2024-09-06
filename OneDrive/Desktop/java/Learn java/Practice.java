import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Practice {
    public static void main(String a[])
    {
        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Divya");
        studentsName.add("Neha");
        System.out.println(studentsName);

        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        // System.out.println(list);

        // list.add(4);
        // System.out.println(list);

        // list.add(1, 8);
        // System.out.println(list);

        // List<Integer> newList = new ArrayList();
        // newList.add(120);
        // newList.add(190);

        // list.addAll(newList);
        // System.out.println(list);


        // System.out.println(list.get(3));
        // list.set(3 , 100);
        // System.out.println(list);

        // foreach loop

        // for(Integer element : list)
        // {
        //     System.out.println("foreach element is " + element );
        // }

        //for loop
        // for (int i =0 ; i<list.size(); i++)
        // {
        //     System.out.println("The element is " + list.get(i));
        // }


        // iterator
        // Iterator<Integer> it = list.iterator();
        // while(it.hasNext())
        // {
        //     System.out.println("Iterator element is " + it.next());
        // }
     

    }
}

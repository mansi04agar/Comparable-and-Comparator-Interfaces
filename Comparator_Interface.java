import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

public class Comparator_Interface
{
    private static Object Students;

    public static void main(String[] args) {

        List<Students> student1=new ArrayList<>() ;
        student1.add(new Students("Hi",54));
        student1.add(new Students("MA",78));
        student1.add(new Students("MA",89));
        student1.add(new Students("ABC",89));
        student1.add(new Students("tegh",100));

        /*Collections.sort(student1,new Students("l",56));
        for(Students s: student1)
        System.out.println(s.name +" "+s.marks);*/

        //CODE when using LAMBDA expression

        Collections.sort(student1,(o1,o2)->{
            if(o1.name.equals(o2.name))    //if the names are equal then sorting the name with higher marks will come before th ename having lower marks
                return o2.marks-o1.marks;
            else
                return o1.name.compareTo(o2.name);
        });
        for(Students s : student1)
            System.out.println(s.name+" "+s.marks);

    }

    static class Students
    {
        String name;
        int marks;
        Students(String name,int marks)
        {
            this.name=name;
            this.marks=marks;
            }

        //Following code is required if u do sorting without using LAMBDA function
        /*public int compare(Students o1, Students o2) {
            /*if(o1.name.equals(o2.name))    //if the names are equal then sorting the name with higher marks will come before th ename having lower marks
                return o2.marks-o1.marks;
            else
                return o1.name.compareTo(o2.name);// else sorting of list will take placeaccording to the names in alphabetical order starting from A.

       if(o1.marks>o2.marks)
          return -1;
        else if (o1.marks<o2.marks)
            return 1;
        else return o1.name.compareTo(o2.name); //if marks are equal for 2 names then sorting will take place according to name
        }*/
        public String getname(String name)
        {
            return this.name;
        }
        public int getmarks(int marks)
        {
            return this.marks;
        }
        public void setname(String name)
        {
            this.name=name;
        }
        public void setmarks(int marks)
        {
            this.marks=marks;
        }
    }


}

import java.util.*;
public class comparable_interface
{
    public static void main(String[] args)
    {
        List<Student> student=new ArrayList<>();
        student.add(new Student("Mansi",88));
        student.add(new Student("Mansi",99));student.add(new Student("wef",78));
        student.add(new Student("dc",65));

        Collections.sort(student);

        for(Student s:student)
        //student.forEach(System.out::println);    displaying objects using Lamba expression

            System.out.println(s.name +" "+s.marks);
    }

}
class Student implements Comparable<Student>
{
    String name;
    int marks;
    Student(String name, int marks)
    {
        this.name=name;
        this.marks=marks;
    }


    @Override
    public int compareTo(Student o) {
       /* if(this.marks>o.marks)
                return -1;
        else if(this.marks<o.marks)
            return 1;
      return  this.name.compareTo(o.name); */  //if marks are equal then list will be sorted according to the names
        if (this.name.equals(o.name))    // sorting the list according to names alphabetically
            return this.marks - o.marks;
        else
            return this.name.compareToIgnoreCase(o.name);
    }
}

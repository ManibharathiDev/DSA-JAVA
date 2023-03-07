import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparators {



    public static void main(String[] args)
    {
        int[] A = {100,34,6,72,67,100,45,26};
        Arrays.sort(A);
        //Arrays.sort
        

        //System.out.println(Arrays.toString(A));

        ArrayList<Student> studList = new ArrayList<Student>();
        Student s1 = new Student();
        s1.setAge(10);
        s1.setName("Manibharathi");
        studList.add(s1);

        Student s2 = new Student();
        s2.setAge(5);
        s2.setName("Shankar");
        studList.add(s2);

        Student s3 = new Student();
        s3.setAge(1);
        s3.setName("Senthil");
        studList.add(s3);

        Student s4 = new Student();
        s4.setAge(26);
        s4.setName("Kumar");
        studList.add(s4);

        Collections.sort(studList,new MyComparator());

        for(int i = 0; i <studList.size(); i++)
        {
            System.out.println(studList.get(i).getAge());
        }


        
    }

    static class MyComparator implements Comparator{

        @Override
        public int compare(Object o1, Object o2) {
            // TODO Auto-generated method stub
            Student s1 = (Student)o1;
            Student s2 = (Student)o2;
            if(s1.age==s2.age)  
                return 0;  
            else if(s1.age<s2.age)  
                return 1;  
            else  
                return -1;  
        }

        
    }

    

    public static class Student{
        int age;
        String name;
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        
    }

    

    
}



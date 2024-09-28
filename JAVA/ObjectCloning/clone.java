import java.obj.*;
class Department{
    int deptId;
    String name;
    Department(int id , String name){
        deptId = id;
        this.name = name;
    }
}

class Student implements Cloneable{
    int id;
    String name;
    Department dept;
    Student(int id, String name, Department d){
        this.id = id;
        this.name = name;
        dept=d;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

package ObjectCloning;

/**
 * clone
 */
public class clone {

    public static void main (String[] args)throws CloneNotSupportedException {
        Department d1 = new Department(1, CSBS);
        Student s1 = new Student(100, Ash, d1);
        Student s2 = (Students)s1.clone();
        System.out.println(s2.id);
    }
    
}
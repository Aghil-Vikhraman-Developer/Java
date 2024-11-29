//QUESION


/*15.Write a Java program to create a class called Employee with methods called work() and getSalary(). 
Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
*/


/*
    TEST CASE:
        Input and Output:
          	working as an employee!
            Employee salary: 40000
            Managing employees
            Manager salary: 70000
            Adding new employee!
        
 */


//ANSWER


class Employee {
    private final int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("working as an employee!");
    }

    public int getSalary() {
        return salary;
    }
}
class HRManager extends Employee {
    public HRManager(int salary) {	
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("\nManaging employees");
    }

    public void addEmployee() {
        System.out.print("\nAdding new employee!");
    }
}
class p15 {
    public static void main(String[] args) {
        Employee emp = new Employee(40000);
        HRManager mgr = new HRManager(70000);

        emp.work();
        System.out.println("Employee salary: " + emp.getSalary());

        mgr.work();
        System.out.println("Manager salary: " + mgr.getSalary());
        mgr.addEmployee();
    }
}
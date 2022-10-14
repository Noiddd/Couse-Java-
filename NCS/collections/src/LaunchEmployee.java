import java.util.*;

class Employee {
    int employeeNumber;
    String employeeName;
    int salary;

    public Employee(int employeeNumber, String employeeName, int salary) {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class LaunchEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        Scanner scan = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("5. Update");
            System.out.println("Enter your choice");
            choice = scan.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter employee number: ");
                    int employeeNumber = scan.nextInt();

                    System.out.print("Enter employee name: ");
                    String employeeName = scan.next();

                    System.out.print("Enter salary: ");
                    int salary = scan.nextInt();

                    employeeList.add(new Employee(employeeNumber, employeeName, salary));
                    break;

                case 2:
                    System.out.println("------------------------");
                    Iterator<Employee> itr = employeeList.iterator();
                    while(itr.hasNext()){
                        System.out.println(itr.next());
                    }
                    System.out.println("---------------------------");
                    break;

                case 3:
                    boolean found = false;
                    System.out.print("Enter the employee number to search: ");
                    employeeNumber = scan.nextInt();
                    System.out.println("---------------------------");
                    itr = employeeList.iterator();
                    while(itr.hasNext()){
                        Employee e = itr.next();
                        if(employeeNumber == e.getEmployeeNumber()){
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if(!found) {
                        System.out.println("Record not found!");
                    }
                    System.out.println("---------------------------");
                    break;

                case 4:
                    found = false;
                    System.out.print("Enter the employee number to delete: ");
                    employeeNumber = scan.nextInt();
                    System.out.println("---------------------------");
                    itr = employeeList.iterator();
                    while(itr.hasNext()){
                        Employee e = itr.next();
                        if(employeeNumber == e.getEmployeeNumber()){
                            itr.remove();
                            found = true;
                        }
                    }
                    if(!found) {
                        System.out.println("Record not found!");
                    } else {
                        System.out.println("Record is deleted");
                    }
                    System.out.println("---------------------------");
                    break;

                case 5:
                    found = false;
                    System.out.print("Enter the employee number to update: ");
                    employeeNumber = scan.nextInt();
                    System.out.println("---------------------------");
                    ListIterator<Employee> litr = employeeList.listIterator();

                    while(litr.hasNext()){
                        Employee e = litr.next();
                        if(employeeNumber == e.getEmployeeNumber()){
                            System.out.print("Enter new name: ");
                            employeeName = scan.next();
                            System.out.print("Enter new salary: ");
                            salary = scan.nextInt();
                            litr.set(new Employee(employeeNumber, employeeName, salary));
                            found = true;
                        }
                    }
                    if(!found) {
                        System.out.println("Record not found!");
                    } else {
                        System.out.println("Record is deleted");
                    }
                    System.out.println("---------------------------");
                    break;
            }

        } while (choice != 0);
    }
}

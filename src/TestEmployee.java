package Task3_13;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Erik", "Monroe", 2000);
        Employee emp2 = new Employee("John", "Smith", 5000);

        System.out.println(emp1.getFirstName()+" "+emp1.getLastName()+"'s monthy salary is --> "+emp1.getMonthlySalary());
        System.out.println(emp2.getFirstName()+" "+emp2.getLastName()+"'s monthy salary is --> "+emp2.getMonthlySalary());

        emp1.setMonthlySalary(emp1.getMonthlySalary()*1.1);
        emp2.setMonthlySalary(emp2.getMonthlySalary()*1.1);

        System.out.println("Salary + 10%");
        System.out.println(emp1.getFirstName()+" "+emp1.getLastName()+"'s monthy salary is --> "+emp1.getMonthlySalary());
        System.out.println(emp2.getFirstName()+" "+emp2.getLastName()+"'s monthy salary is --> "+emp2.getMonthlySalary());
    }
}

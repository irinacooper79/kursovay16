public class Employee {
    private final String fullName;

    private static int counter = 8;

    private int salary;

    private int department;

    private final int id;

    public Employee(String fullName, int salary, int department);


        this.fullName =fullName;
        this.salary =salary;
        this.department =department;
        this.id =counter++;
}

    public int getSalary(){
        return salary;
    }
    public void setSalary ( int salary){
        this.salary = salary;
    }
    public String getFullName () {
        return this.fullName;
    }
    public int getDepartment () {
        return department;
    }
    public void setDepartment ( int department){
        this.department = department;
    }
    public int get id(){
    return id;
}
}

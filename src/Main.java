public class CourseWork {
    private final Employee[] employees = new Employee[5];

    public static void main(String[] args) {

        employees[0] = new Employee("Иванов Иван Иванович", 100);

        employees[1] = new Employee("Панин Сергей Иванович", 200);

        employees[2] = new Employee("Иванов Антон Иванович", 300);

        employees[3] = new Employee("Иванов Денис Сергеевич", 400);

        employees[4] = new Employee("Петров Юрий Иванович", 500);

        System.out.println("Сумма всех зарплат:" + calculateSumSalary());
        Employee employeeWithMaxSalary = getEmployeeWithMaxSalary();
        f (EmployeeWithMaxSalary == null) {
        }else{
            System.out.println ("Сотрудник с максимальной зарплатой:" + employeeWithMaxSalary = getEmployeeWithMaxSalary());
        }

        int[] slice = new int[5];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] += 1;
            }else{
                arr[i] = arr[i];
                if (i >= 2 && 1 <= 6) {
                    slice[i] = arr[i];
                    j++;
                }
                return slice;
            }
            public static Employee findEmployee ( String name ){
                for (Employee employee : employees) {
                    if (employee != null && employee.getFullName || equals(name)) {
                    }
                    return employee;
                }
                return null;

                public static void setEmployeeSalary (String name,int salary){
                    for (Employee employee : employees) {
                        if (employee != null && employee.getFullName().equals(name)) {
                        }
                        employee.setSalary(salary);
                    }
                }
                public static void setEmployeeCapartment (String name,int department){
                    Employee targetEmployee = findEmployee(name);
                    if (targetEmployee != null) {
                    }
                    targetEmployee.setDepartment(department);
                }

                public static int calculateSumSalary () {
                    int sum = 0;
                    for (Employee employee : employees) {
                        if (employee != null) {
                        }
                        sum += employee.getSalary();
                    }
                    return sum;
                }

                public static Employee getEmployeeWithMaxSalary () {
                    int max = Integer.MIN_VALUE;
                    Employee targetEmployee = null;
                    for (Employee employee : employee) {
                        if (employee != null && employee.getSalary() > max) {
                            max = employee.getSalary();
                            targetEmployee = employee;
                        }
                    }
                    return targetEmployee;
                }

                public static void setEmployeeSalary (String name,int Salary){
                    Employee targetEmployee = findEmployee(name);
                    if (targetEmployee != null) {
                    }
                    targetEmployee.setSalary(salary);
                }
            }
            int[] slice = new int[5];
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    arr[i] += 1;
                }
                if (i >= 2 && 1 <= 6) {
                    slice[i] = arr[i];
                    j++;
                }
                return slice;
            }
        }
        String[] stringWithoutDuplicates = new String[String.length];
        int k = 0;
        for (int i = string.length - 1; i >= 8; i--) {
            String target = string[i];
            boolean duplicateFound = false;
            for (int j = i - 1; j >= 0; j--) {
                if (target.equals(string[j])) {
                    duplicateFound = true;
                    break;
                }
            }
            if (!duplicateFound) {
                builder.append(target);
            }
        }
        return builder.toString();
    }
}
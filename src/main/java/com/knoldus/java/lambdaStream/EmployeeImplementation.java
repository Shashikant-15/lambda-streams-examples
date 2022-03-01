package com.knoldus.java.lambdaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class EmployeeImplementation {
    /**
     * sortByName(List<Employee> employeeList) using following methods from Stream API.
     * sort(): sort the list of all employees name i.e Ascending order
     * @param employeeList list of employees
     * @return true if all the employee sorted by their name otherwise false.
     */
    public static List<Employee> sortByName(List<Employee> employeeList){

        employeeList.sort((Employee e1, Employee e2) -> e1.getSureName().compareTo(e2.getSureName()));
        return employeeList;
    }
    /**
     *
     * filterAllEmployeeDataStartingNameWith_A (List<Employee> employeeList) using following methods from Stream API
     * stream(): creates sequential Stream
     * collect(): collect the result of a Stream processing pipeline in a list by using Collectors.toList() method
     * @param employeeList list of employees
     * @return true if all Employee Starting Name with 'A' otherwise false.
     */
    public static List<Employee> filterAllEmployeeDataStartingNameWith_A (List<Employee> employeeList){
        List<Employee> list1 = employeeList.stream().filter(emp -> emp.getSureName().startsWith("A")).collect(Collectors.toList());
        return list1;
    }

    /**
     * filterAllEmployeeDataStartingNameWith_P (List<Employee> employeeList) using following methods from Stream API
     * stream(): creates sequential Stream
     * collect(): collect the result of a Stream processing pipeline in a list by using Collectors.toList() method
     * @param employeeList list of employees
     * @return true if filter all Employee Data Starting Name With 'P' otherwise false.
     */
    public static List<Employee> filterAllEmployeeDataStartingNameWith_P (List<Employee> employeeList){
        List<Employee> list2=employeeList.stream().filter(name -> name.getName().startsWith("P")).collect(Collectors.toList());
        return list2;
    }
    /**
     * printingAllEmployeeNamesInUpperCase (List<Employee> employeeList) using following methods from Stream API
     * stream(): creates sequential Stream
     * @param employeeList list of employees
     * @return true if printing All Employee Names in Upper Case otherwise false.
     */
    public static  List<Employee>printingAllEmployeeNamesInUpperCase (List<Employee> employeeList){

        employeeList.stream().forEach(name -> System.out.println(name.toString().toUpperCase()));
        return employeeList;
    }
     /**
      * filterAllEmployeeNamesEndingWith_A_inUpperCase (List<Employee> employeeList) using following methods from Stream API
      * stream(): creates sequential Stream
      * filter(): returns Stream that match the predicate
      * @param employeeList list of employees
      * @return true if filter all Employee Names Ending With 'A' in Upper Case otherwise false.
      */
    public static  List<Employee>filterAllEmployeeNamesEndingWith_A_inUpperCase (List<Employee> employeeList){
        employeeList.stream().filter(name -> name.getName().endsWith("A")).forEach(name -> System.out.println(name.toString().toUpperCase()));
        return employeeList;
    }

     /**
      * countEmployeeWhoseNamesEndingWith_A_Letter(List<Employee> employeeList) using following methods from Stream API
      * filter(): returns Stream that match the predicate
      * count(): return the number of elements in the stream.
      * @param employeeList list of employees
      * @return true if counted Employee Whose Names Ending With 'A' Letter otherwise false.
      */
    public static List<Employee> countEmployeeWhoseNamesEndingWith_A_Letter(List<Employee> employeeList){

        System.out.println(employeeList.stream().filter(name -> name.getName().endsWith("A")).count());
        return employeeList;
    }
     /**
      * printingEmployeeNamesStartingWith_D_Letter(List<Employee> employeeList) using following methods from Stream API
      * stream(): creates sequential Stream
      * filter(): returns Stream that match the predicate
      * @param employeeList list of employees
      * @return true if printing all Employee Names Starting With Letter 'D' otherwise false.
      */
    public static  List<Employee>printingEmployeeNamesStartingWith_D_Letter(List<Employee> employeeList) {
        employeeList.stream().filter(name -> name.getName().startsWith("D")).forEach(name -> System.out.println(name));
        return employeeList;
    }
     /**
      * employeeWhoseAgeAreMoreThan_23_Yrs (List<Employee> employeeList) using following methods from Stream API
      * @param employeeList list of employees
      * @return employees, Whose Age are more than 23 Years .
      */
    public static  List<Employee>employeeWhoseAgeAreMoreThan_23_Yrs (List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.println("Name is = " + employee.getName() + " age is = " + employee.getAge());
        }
        return employeeList;
    }

    /**
     * main method called here
     */
        public static void main(String[] args) {

            /**
             *  A list of object employee class
             */
        ArrayList<Employee> employeeList = new ArrayList<>();

        //adding data to the array list
        employeeList.add(new Employee(23, "KRISHNA", "VASUDEV"));
        employeeList.add(new Employee(24, "PRAKHAR", "RASHTOGI"));
        employeeList.add(new Employee(22, "DEEPAK", "KUMAR"));
        employeeList.add(new Employee(25, "AASHIF", "ALI"));
        employeeList.add(new Employee(21, "vaishali", "yaadav"));
        employeeList.add(new Employee(22, "PRATIBHA", "YADAV"));
        employeeList.add(new Employee(23, "ARUNESH", "JAIN"));
        employeeList.add(new Employee(24, "SHIVAM", "ROY"));
        employeeList.add(new Employee(25, "anshita", "mathur"));

        System.out.println("===========================================");
        System.out.println("a) After Sorting the employee data by Name:");
        sortByName(employeeList).forEach((e) -> System.out.println(e));

        // filter all name starting with 'A'
            System.out.println("===========================================");
        System.out.println("b) filter all employee data starting name with 'A'");
        System.out.println("\n");
        filterAllEmployeeDataStartingNameWith_A(employeeList).forEach((e) -> System.out.println(e));


        System.out.println("===========================================");
        System.out.println("c) filter all the employee names starting with P");
        filterAllEmployeeDataStartingNameWith_P(employeeList).forEach(name -> System.out.println(name));
        System.out.println("");

        System.out.println("===========================================");
        System.out.println(" d) printing all employee names in upper case");
        printingAllEmployeeNamesInUpperCase(employeeList);
        System.out.println("");

        System.out.println("===========================================");
        System.out.println("e) filter all the employee names ending with A in upper case\n");
        filterAllEmployeeNamesEndingWith_A_inUpperCase(employeeList);
        System.out.println("");

        System.out.println("===========================================");
        System.out.println("f) count the employee names ending with 'A' Letter");
        System.out.println(employeeList.stream().filter(name -> name.getName().endsWith("A")).count());
        System.out.println("");

        System.out.println("===========================================");
        System.out.println("g) printing the employee names starting with D");
        printingEmployeeNamesStartingWith_D_Letter(employeeList);
        System.out.println("");

        System.out.println("===========================================");
        List<Employee> employeeListHavingAgeMoreThan23 = employeeList.stream().filter(e -> (e).getAge() > 23).collect(Collectors.toList());
        System.out.println("h) Employee whose age more than 23 yrs are");
        employeeWhoseAgeAreMoreThan_23_Yrs(employeeListHavingAgeMoreThan23);

        System.out.println("===========================================");

    }
}

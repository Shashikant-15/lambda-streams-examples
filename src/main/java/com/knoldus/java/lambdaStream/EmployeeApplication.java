package com.knoldus.java.lambdaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.knoldus.java.lambdaStream.EmployeeImplementation.employeeWhoseAgeAreMoreThan_23_Yrs;
import static com.knoldus.java.lambdaStream.EmployeeImplementation.filterAllEmployeeDataStartingNameWith_A;
import static com.knoldus.java.lambdaStream.EmployeeImplementation.filterAllEmployeeDataStartingNameWith_P;
import static com.knoldus.java.lambdaStream.EmployeeImplementation.filterAllEmployeeNamesEndingWith_A_inUpperCase;
import static com.knoldus.java.lambdaStream.EmployeeImplementation.printingAllEmployeeNamesInUpperCase;
import static com.knoldus.java.lambdaStream.EmployeeImplementation.printingEmployeeNamesStartingWith_D_Letter;
import static com.knoldus.java.lambdaStream.EmployeeImplementation.sortByName;

public class EmployeeApplication {
    /**
     * main method called
     * @param args arguments
     */
    public static void main(String[] args) {

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



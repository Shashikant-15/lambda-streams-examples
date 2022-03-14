package com.knoldus.java.lambdaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.knoldus.java.lambdaStream.EmployeeImplementation.employeeWhoseAgeAreMoreThan_23_Yrs;
import static com.knoldus.java.lambdaStream.EmployeeImplementation.filterAllEmployeeDataStartingNameWith_A;
import static com.knoldus.java.lambdaStream.EmployeeImplementation.filterAllEmployeeDataStartingNameWith_P;
import static com.knoldus.java.lambdaStream.EmployeeImplementation.filterAllEmployeeNamesEndingWith_A_inUpperCase;
import static com.knoldus.java.lambdaStream.EmployeeImplementation.printingAllEmployeeNamesInUpperCase;
import static com.knoldus.java.lambdaStream.EmployeeImplementation.printingEmployeeNamesStartingWith_D_Letter;
import static com.knoldus.java.lambdaStream.EmployeeImplementation.sortByName;

public class EmployeeApplication {

    // LOGGER added
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeApplication.class);
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

        LOGGER.info("===========================================");
        LOGGER.info("a) After Sorting the employee data by Name:");
        sortByName(employeeList).forEach((e) -> LOGGER.info(String.valueOf(e)));

        // filter all name starting with 'A'
        LOGGER.info("===========================================");
        LOGGER.info("b) filter all employee data starting name with 'A'");
        LOGGER.info("\n");
        filterAllEmployeeDataStartingNameWith_A(employeeList).forEach((e) -> LOGGER.info(String.valueOf(e)));


        LOGGER.info("===========================================");
        LOGGER.info("c) filter all the employee names starting with P");
        filterAllEmployeeDataStartingNameWith_P(employeeList).forEach(name -> LOGGER.info(String.valueOf(name)));
        LOGGER.info("");

        LOGGER.info("===========================================");
        LOGGER.info(" d) printing all employee names in upper case");
        printingAllEmployeeNamesInUpperCase(employeeList);
        LOGGER.info("");

        LOGGER.info("===========================================");
        LOGGER.info("e) filter all the employee names ending with A in upper case\n");
        filterAllEmployeeNamesEndingWith_A_inUpperCase(employeeList);
        LOGGER.info("");

        LOGGER.info("===========================================");
        LOGGER.info("f) count the employee names ending with 'A' Letter");
        LOGGER.info(String.valueOf(employeeList.stream().filter(name -> name.getName().endsWith("A")).count()));
        LOGGER.info("");

        LOGGER.info("===========================================");
        LOGGER.info("g) printing the employee names starting with D");
        printingEmployeeNamesStartingWith_D_Letter(employeeList);
        LOGGER.info("");

        LOGGER.info("===========================================");
        List<Employee> employeeListHavingAgeMoreThan23 = employeeList.stream().filter(e -> (e).getAge() > 23).collect(Collectors.toList());
        LOGGER.info("h) Employee whose age more than 23 yrs are");
        employeeWhoseAgeAreMoreThan_23_Yrs(employeeListHavingAgeMoreThan23);

        LOGGER.info("===========================================");

    }
}



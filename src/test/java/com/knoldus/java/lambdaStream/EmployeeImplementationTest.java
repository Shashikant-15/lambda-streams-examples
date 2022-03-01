package com.knoldus.java.lambdaStream;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeImplementationTest {

    ArrayList<Employee> employeeList = new ArrayList<>();

   @BeforeEach
    void setUp() {
        //adding data to the array list
       employeeList.add(new Employee(23, "KRISHNA", "VASUDEV"));
       employeeList.add(new Employee(22, "PRAKHAR", "RASHTOGI"));
       employeeList.add(new Employee(22, "DEEPAK", "KUMAR"));
       employeeList.add(new Employee(25, "AASHIF", "ALI"));
       employeeList.add(new Employee(21, "vaishali", "yaadav"));
       employeeList.add(new Employee(22, "PRATIBHA", "YADAV"));
       employeeList.add(new Employee(23, "ARUNESH", "JAIN"));
       employeeList.add(new Employee(24, "SHIVAM", "ROY"));
       employeeList.add(new Employee(25, "anshita", "mathur"));

   }
 @Test
    public void testSortByName(){
        List<Employee> employees = EmployeeImplementation.sortByName(employeeList);
        Assert.assertEquals("Employee{age=25, name='AASHIF', sureName='ALI'}",employees.get(0).toString());
    }

    @Test
    public void testFilterAllEmployeeDataStartingNameWith_A(){
       List<Employee> employees = EmployeeImplementation.filterAllEmployeeDataStartingNameWith_A(employeeList);
       Assert.assertEquals("Employee{age=25, name='AASHIF', sureName='ALI'}",employees.get(0).toString());
    }
    @Test
    public void testFilterAllEmployeeDataStartingNameWith_P(){
        List<Employee> employees = EmployeeImplementation.filterAllEmployeeDataStartingNameWith_P(employeeList);
        Assert.assertEquals("Employee{age=22, name='PRATIBHA', sureName='YADAV'}",employees.get(1).toString());
    }
    @Test
    public void testPrintingAllEmployeeNamesInUpperCase(){
        List<Employee> employees = EmployeeImplementation.printingAllEmployeeNamesInUpperCase(employeeList);
        Assert.assertEquals("Employee{age=22, name='PRATIBHA', sureName='YADAV'}",employees.get(5).toString());
    }
    @Test
    public void testFilterAllEmployeeNamesEndingWith_A_inUpperCase() {
        List<Employee> employees = EmployeeImplementation.filterAllEmployeeNamesEndingWith_A_inUpperCase(employeeList);
        Assert.assertEquals("Employee{age=22, name='PRATIBHA', sureName='YADAV'}", employees.get(5).toString());
    }

    @Test
    public void testCountEmployeeWhoseNamesEndingWith_A_Letter(){
        List<Employee> employees = EmployeeImplementation.countEmployeeWhoseNamesEndingWith_A_Letter(employeeList);
        Assert.assertEquals("Employee{age=23, name='ARUNESH', sureName='JAIN'}",employees.get(6).toString());

    }
    @Test
    public void testPrintingEmployeeNamesStartingWith_D_Letter(){
        List<Employee> employees = EmployeeImplementation.printingEmployeeNamesStartingWith_D_Letter(employeeList);
        Assert.assertEquals("Employee{age=22, name='DEEPAK', sureName='KUMAR'}",employees.get(2).toString());

    }
    @Test
    public void testEmployeeWhoseAgeAreMoreThan_23_Yrs(){
        List<Employee> employees = EmployeeImplementation.employeeWhoseAgeAreMoreThan_23_Yrs(employeeList);
        Assert.assertEquals("Employee{age=25, name='anshita', sureName='mathur'}",employees.get(8).toString());

    }

}
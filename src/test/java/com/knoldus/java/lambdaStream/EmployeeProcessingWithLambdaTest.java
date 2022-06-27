package com.knoldus.java.lambdaStream;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class points the employee data
 * Testing activity processing with Lambda.
 *
 * @author Shashikant
 * @version 1.0
 * @see Employee
 */
public class EmployeeProcessingWithLambdaTest {

    ArrayList<Employee> employeeList = new ArrayList<>();

    @BeforeEach
    void setUp() {
        //adding data to the array list
        employeeList.add(new Employee(23, "KRISHNA", "VASUDEV", 50000));
        employeeList.add(new Employee(22, "PRAKHAR", "RASHTOGI", 45000));
        employeeList.add(new Employee(22, "DEEPAK", "KUMAR", 35000));
        employeeList.add(new Employee(25, "AASHIF", "ALI", 55000));
        employeeList.add(new Employee(21, "vaishali", "yaadav", 51000));
        employeeList.add(new Employee(22, "PRATIBHA", "YADAV", 43500));
        employeeList.add(new Employee(23, "ARUNESH", "JAIN", 42000));
        employeeList.add(new Employee(24, "SHIVAM", "ROY", 38500));
        employeeList.add(new Employee(25, "anshita", "mathur", 41000));

    }

    @Test
    public void testSortByName() {
        List<Employee> employees = EmployeeProcessingWithLambda.sortByName(employeeList);
        Assertions.assertEquals("Employee{age=25, name='AASHIF', sureName='ALI', salary=55000.0}", employees.get(0).toString());
    }

    /**
     * Method under test: {@link EmployeeProcessingWithLambda#sortByName(List)}
     */
    @Test
    void testSortByName2() {
        assertTrue(EmployeeProcessingWithLambda.sortByName(new ArrayList<>()).isEmpty());
    }

    /**
     * Method under test: {@link EmployeeProcessingWithLambda#sortByName(List)}
     */
    @Test
    void testSortByName3() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(24, "SHIVAM", "ROY", 38500));
        employeeList.add(new Employee(25, "anshita", "mathur", 41000));
        assertEquals(2, EmployeeProcessingWithLambda.sortByName(employeeList).size());
    }

    /**
     * Method under test: {@link EmployeeProcessingWithLambda#sortByName(List)}
     */
    @Test
    void testSortByName4() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(22, "PRAKHAR", "RASTOGI", 45000));
        assertEquals(1, EmployeeProcessingWithLambda.sortByName(employeeList).size());
    }

    /**
     * Method under test: {@link EmployeeProcessingWithLambda#sortInLambdaWay(List)}
     */
    @Test
    void testSortInLambdaWay() {
        assertTrue(EmployeeProcessingWithLambda.sortInLambdaWay(new ArrayList<>()).isEmpty());
    }

    /**
     * Method under test: {@link EmployeeProcessingWithLambda#sortInLambdaWay(List)}
     */
    @Test
    void testSortInLambdaWay2() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(21, "\n\n<--- Sorted list with Lambda - DESC order --->", "Deepak", 35000));
        assertEquals(1, EmployeeProcessingWithLambda.sortInLambdaWay(employeeList).size());
    }

    /**
     * Method under test: {@link EmployeeProcessingWithLambda#sortInLambdaWay(List)}
     */
    @Test
    void testSortInLambdaWay3() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(22, "vaishali", "Yaadav", 51000));
        employeeList.add(new Employee(23, "Shivam", "Roy", 38500));
        assertEquals(2, EmployeeProcessingWithLambda.sortInLambdaWay(employeeList).size());
    }

    /**
     * Method under test: {@link EmployeeProcessingWithLambda#sortInLambdaWay(List)}
     */
    @Test
    void testSortInLambdaWay4() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(22, "Deepak", "Kumar", 35000));
        employeeList.add(new Employee(23, "KRISHNA", "VASUDEV", 50000));

        assertEquals(2, EmployeeProcessingWithLambda.sortInLambdaWay(employeeList).size());
    }

    /**
     * Method under test: {@link EmployeeProcessingWithLambda#sortInAscendingOrder(List)}
     */
    @Test
    void testSortInAscendingOrder() {
        assertTrue(EmployeeProcessingWithLambda.sortInAscendingOrder(new ArrayList<>()).isEmpty());
    }

    /**
     * Method under test: {@link EmployeeProcessingWithLambda#sortInAscendingOrder(List)}
     */
    @Test
    void testSortInAscendingOrder2() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(22, "DEEPAK", "KUMAR", 38500));
        employeeList.add(new Employee(23, "ARUNESH", "JAIN", 42000));
        assertEquals(2, EmployeeProcessingWithLambda.sortInAscendingOrder(employeeList).size());
    }

    /**
     * Method under test: {@link EmployeeProcessingWithLambda#sortInAscendingOrder(List)}
     */
    @Test
    void testSortInAscendingOrder3() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(22, "Deepak", "Kumar", 38500));
        employeeList.add(new Employee(23, "Krishna", "Vasudev", 50000));
        employeeList.add(new Employee(22, "PRAKHAR", "Rastogi", 45000));
        assertEquals(3, EmployeeProcessingWithLambda.sortInAscendingOrder(employeeList).size());
    }

    /**
     * Method under test: {@link EmployeeProcessingWithLambda#sortInAscendingOrder(List)}
     */

    @Test
    void testSortInDescendingOrder() {
        assertTrue(EmployeeProcessingWithLambda.sortInDescendingOrder(new ArrayList<>()).isEmpty());
    }

    /**
     * Method under test: {@link EmployeeProcessingWithLambda#sortInDescendingOrder(List)}
     */
    @Test
    void testSortInDescendingOrder2() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(22, "Deepak", "Kumar", 38500));
        employeeList.add(new Employee(22, "Prakhar", "Rastogi", 45000));
        assertEquals(2, EmployeeProcessingWithLambda.sortInDescendingOrder(employeeList).size());
    }

    /**
     * Method under test: {@link EmployeeProcessingWithLambda#sortInDescendingOrder(List)}
     */
    @Test
    void testSortInDescendingOrder3() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(23, "Arunesh", "Jain", 42000));
        assertEquals(1, EmployeeProcessingWithLambda.sortInDescendingOrder(employeeList).size());
    }

    /**
     * Method under test: {@link EmployeeProcessingWithLambda#sortInDescendingOrder(List)}
     */
    @Test
    public void sortInAscendingOrder() {
        List<Employee> employee = EmployeeProcessingWithLambda.sortByName(employeeList);
        Assertions.assertEquals("Employee{age=24, name='SHIVAM', sureName='ROY', salary=38500.0}", employee.get(4).toString());

    }

    @Test
    public void sortInDescendingOrder() {
        List<Employee> employee = EmployeeProcessingWithLambda.sortByName(employeeList);
        Assertions.assertEquals("Employee{age=23, name='ARUNESH', sureName='JAIN', salary=42000.0}", employee.get(1).toString());

    }

    @Test
    public void sortInLambdaWay() {
        List<Employee> employees = EmployeeProcessingWithLambda.sortByName(employeeList);
        Assertions.assertEquals("Employee{age=23, name='KRISHNA', sureName='VASUDEV', salary=50000.0}", employees.get(5).toString());
    }
}

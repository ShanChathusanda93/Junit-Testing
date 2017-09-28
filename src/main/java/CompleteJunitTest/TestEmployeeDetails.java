package CompleteJunitTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestEmployeeDetails {
    EmpBusinesLogic empBusinesLogic=new EmpBusinesLogic();
    EmployeeDetails employeeDetails=new EmployeeDetails();

    //  Test to check yearly salary
    @Test
    public void testCalculateYearlySalary(){
        employeeDetails.setName("Sanjeewa");
        employeeDetails.setAge(25);
        employeeDetails.setMonthlySalary(8000);

        double salary=empBusinesLogic.calculateYearlySalary(employeeDetails);
        assertEquals(96000,salary,0.0);
    }

    //--Test to check appraisal
    @Test
    public void testCalculateAppraisal(){
        employeeDetails.setName("Sanjeewa");
        employeeDetails.setAge(25);
        employeeDetails.setMonthlySalary(8000);

        double appraisal=empBusinesLogic.calculateApprisal(employeeDetails);
        assertEquals(1000,appraisal,0.0);
    }
}

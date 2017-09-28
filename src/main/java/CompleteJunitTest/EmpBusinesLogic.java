package CompleteJunitTest;

public class EmpBusinesLogic {
    //--Calculate the yearly salary of employee
    public double calculateYearlySalary(EmployeeDetails employeeDetails){
        double yearlySalary=0;
        yearlySalary=employeeDetails.getMonthlySalary()*12;
        return yearlySalary;
    }

    //--Calculate the appraisal amount of employee
    public double calculateApprisal(EmployeeDetails employeeDetails){
        double appraisal=0;

        if(employeeDetails.getMonthlySalary()<10000){
            appraisal=500;
        }
        else{
            appraisal=1000;
        }
        return appraisal;
    }
}

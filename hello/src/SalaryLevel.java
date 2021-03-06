public class SalaryLevel implements SalaryLevelInterface, Payroll
{
    private String grade;
    private double salary;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //polymorphism
    @Override
    public double calculateSalary()
    {
        return salary*2;
    }

    @Override
    public boolean isProcessed() {
        return false;
    }
//
//    //polymorphism, same method,same name, difft params
    public double calculateSalary(double multiplier)
    {
        return salary*multiplier;
    }


}

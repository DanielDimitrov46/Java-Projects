public class HourlyWorker extends Worker{
private String workType;
    private int hoursWorked;

    public HourlyWorker(String name, int salaryPerHour, String workType, int hoursWorked) {
        super(name, salaryPerHour);
        this.workType = workType;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double getWeeklySalary() {
        double salary = 0;
        if (hoursWorked <= 40) {
            salary = hoursWorked * getSalaryPerHour();
        } else {
            salary = 40 * getSalaryPerHour() + (hoursWorked - 40) * getSalaryPerHour() * 1.5;
        }
        return salary;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

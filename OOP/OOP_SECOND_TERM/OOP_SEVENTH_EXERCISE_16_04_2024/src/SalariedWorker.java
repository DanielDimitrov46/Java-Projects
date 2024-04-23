public class SalariedWorker extends Worker {
    private String workType;
    private int hoursWorked;

    public SalariedWorker(String name, int salaryPerHour, String workType, int hoursWorked) {
        super(name, salaryPerHour);
        this.workType = workType;
        this.hoursWorked = hoursWorked;
    }

    // Имплементация на метода за изчисляване на седмичната заплата за щатен работник
    @Override
    public double getWeeklySalary() {
        return hoursWorked * getSalaryPerHour();
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

public abstract class Worker {
    private String name;
    private int salaryPerHour;

    public abstract double getWeeklySalary();

    public Worker(String name, int salaryPerHour) {
        this.name = name;
        this.salaryPerHour = salaryPerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
}

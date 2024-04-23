public class App {
    public static void main(String[] args) {
        // Създаване на масив от работници
        Worker[] workers = new Worker[2];
        workers[0] = new HourlyWorker("Иван", 10, "Почасова работа", 45);
        workers[1] = new SalariedWorker("Петър", 15, "Щатна работа", 40);

        // Пример за извеждане на информация за всеки работник и изчисляване на общата седмична заплата
        double totalSalary = 0;
        int totalHoursWorked = 0;
        for (Worker worker : workers) {
            System.out.println("Име: " + worker.getName());
            System.out.println("Седмична заплата: " + worker.getWeeklySalary());
            System.out.println();
            totalSalary += worker.getWeeklySalary();
        }

        // Изчисляване на средния брой часове и средната заплата
        for (Worker worker : workers) {
            totalHoursWorked += worker instanceof HourlyWorker ? ((HourlyWorker) worker).getHoursWorked() : ((SalariedWorker) worker).getHoursWorked();
        }
        double averageHoursWorked = (double) totalHoursWorked / workers.length;
        double averageSalary = totalSalary / workers.length;

        System.out.println("Общ брой часове: " + totalHoursWorked);
        System.out.println("Среден брой часове: " + averageHoursWorked);
        System.out.println("Обща заплата: " + totalSalary);
        System.out.println("Средна заплата: " + averageSalary);
    }
}
import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Worker> workers;

    public Department(String name, List<Worker> workers) {
        this.name = name;
        this.workers = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }
    public void addWorker(Worker worker) {

    }
}

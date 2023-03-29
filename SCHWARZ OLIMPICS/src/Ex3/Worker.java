abstract class Worker {
    private int workerId;
    private String name;

    public Worker(int workerId, String name) {
        this.workerId = workerId;
        this.name = name;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void greeting(Worker name);

}

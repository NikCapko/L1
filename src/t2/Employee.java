package t2;

class Employee {

    private String name;
    private int rate;
    private int time;

    public Employee(String name, int rate, int time) {
        this.name = name;
        this.rate = rate;
        this.time = time;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return this.rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getTime() {
        return this.time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}

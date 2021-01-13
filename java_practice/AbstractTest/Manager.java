package AbstractTest;

public class Manager extends Employee {
    private double bonus;

    public void work(){
        System.out.println("xxxxx");
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

}

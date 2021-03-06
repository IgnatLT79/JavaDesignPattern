package GoodPractices.Solid.DependencyInversion;

public class ManagerMain {

    public static void main(String[] args) {

       Manager manager = new Manager();
       manager.setEmployee(new Developer());
       manager.manage();

       manager.setEmployee(new Architect());
       manager.manage();

       manager.setEmployee(new BusinessAnalyst());
       manager.manage();

       manager.setEmployee(new QaTester());
       manager.manage();
    }
}

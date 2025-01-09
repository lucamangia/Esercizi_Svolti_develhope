package co.develhope.Lezioni.Lezione_09_01;

public class Manager extends TeamMember{
    private static final double RATEORARIO = 50.0;

    public Manager(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return hoursWorked*RATEORARIO;
    }
}

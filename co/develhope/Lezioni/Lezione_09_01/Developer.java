package co.develhope.Lezioni.Lezione_09_01;

public class Developer extends TeamMember{

    private static final double RATEORARIO = 30.0;

    public Developer(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return hoursWorked*RATEORARIO;
    }
}

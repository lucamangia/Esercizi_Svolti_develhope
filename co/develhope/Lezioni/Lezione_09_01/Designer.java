package co.develhope.Lezioni.Lezione_09_01;

public class Designer extends TeamMember{

    private static final double RATEORARIO = 25.0;

    public Designer(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return hoursWorked*RATEORARIO;
    }
}

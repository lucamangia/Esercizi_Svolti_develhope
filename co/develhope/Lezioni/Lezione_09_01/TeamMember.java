package co.develhope.Lezioni.Lezione_09_01;

public abstract class TeamMember {
    protected String name;
    protected int hoursWorked;

    public TeamMember(String name) {
        this.name = name;
        this.hoursWorked = 0;
    }



    public abstract double calculateSalary();
    public void logHours(int hours){
        hoursWorked += hours;
    };

    @Override
    public String toString() {
        return "TeamMember{" +
                "name='" + name + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", salary=" + calculateSalary()+
                '}';
    }
}

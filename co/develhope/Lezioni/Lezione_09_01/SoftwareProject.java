package co.develhope.Lezioni.Lezione_09_01;

import java.util.ArrayList;

public class SoftwareProject implements Project {

    private ArrayList<TeamMember> teamMemberArrayList = new ArrayList<>();


    @Override
    public double calculateBudget() {
        double somma = 0;
        for (TeamMember teamMember : teamMemberArrayList) {
            somma = somma + teamMember.calculateSalary();
        }
        return somma;
    }

    public void addMember(TeamMember teamMember) {
        if (teamMember != null) {
            teamMemberArrayList.add(teamMember);
        }
    }

    public void printTeamdetails(){
        if (teamMemberArrayList.isEmpty()){
            System.out.println("Il team è vuoto");
        }
        for (TeamMember teamMember : teamMemberArrayList){
            System.out.println(teamMember);
        }
    }


}

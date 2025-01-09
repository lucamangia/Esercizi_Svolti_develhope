package co.develhope.Lezioni.Lezione_09_01;

import java.sql.Array;

public class Main {
    /*Sistema di Gestione di Progetti
    Crea un sistema per gestire progetti con team composti da diverse tipologie di membri.
    Definisci una classe astratta TeamMember con:
    Campi: String name, int hoursWorked.
    Metodo astratto: double calculateSalary().
    Metodo concreto: void logHours(int hours).
    Implementa tre sottoclassi:
    Developer (calcolo salario: hoursWorked * 30).
    Designer (calcolo salario: hoursWorked * 25).
    Manager (calcolo salario: hoursWorked * 50).
    Definisci un'interfaccia Project con:
    Metodo: double calculateBudget().
    Implementa una classe SoftwareProject che implementa l'interfaccia e calcola il budget come somma dei salari dei membri del team.
    Usa un ArrayList<TeamMember> per gestire il team e scrivi metodi per:
    Aggiungere membri al progetto.
    Calcolare il budget totale.
    Stampare i dettagli dei membri del team.*/

    public static void main(String[] args) {


        Designer designer = new Designer("ben");
        Manager manager   = new Manager("ten");
        Developer developer = new Developer("anna");

        designer.logHours(10);
        manager.logHours(12);
        developer.logHours(14);

        SoftwareProject softwareProject = new SoftwareProject();

        softwareProject.addMember(designer);
        softwareProject.addMember(manager);
        softwareProject.addMember(developer);

        System.out.println(softwareProject.calculateBudget());
        softwareProject.printTeamdetails();

    }
}

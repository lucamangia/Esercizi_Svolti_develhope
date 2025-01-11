package co.develhope.classi.interfaccia;

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(20,15);
        System.out.println(rettangolo.calcolaArea());
        Triangolo triangolo = new Triangolo(15,45.2);
        System.out.println(triangolo.calcolaArea());
    }
}

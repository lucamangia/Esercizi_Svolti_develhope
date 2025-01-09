package co.develhope.eserciziVari;


public class Studente {

    public String nome;
    public String cognome;
    public int identificativo;


    public Studente(String nome, String cognome, int identificativo) {
        this.nome = nome;
        this.cognome = cognome;
        this.identificativo = identificativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }


    public int getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(int identificativo) {
        this.identificativo = identificativo;
    }

    public String toString() {
        return "Studente [Nome=" + nome + ", Cognome=" + cognome + ", Identificativo=" + identificativo + "]";
    }

}


package co.develhope.classi.uno.classi.due;

    public class Animale {

        public Animale() {
        }

        private String nome;
        private String specie;
        private String verso;


        public Animale(String nome, String specie, String verso) {
            this.nome = nome;
            this.specie = specie;
            this.verso = verso;
        }

        public void emettiVerso() {
            System.out.println(verso);
        }

        public String getNome() {
            return nome;
        }

        public String getSpecie() {
            return specie;
        }

        public String getVerso() {
            return verso;
        }
    }




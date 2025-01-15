package co.develhope.test.tre;

import co.develhope.test.due.FormatDate;


    public class Main {
        public static void main(String[] args) {
            String data = "2023-03-01T13:00:00Z";
            String dataFormattata = FormatDate.formattaData(data);
            System.out.println(dataFormattata);
        }
    }


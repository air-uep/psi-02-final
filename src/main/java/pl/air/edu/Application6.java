package pl.air.edu;

import pl.air.edu.service.CreateService;
import pl.air.edu.service.EduService;

public class Application6 {

    public static void main(String[] args) {
        EduService edu = new EduService();
        CreateService.insertData(edu);

        if (edu.isEmpty()) {
            System.out.println("Brak danych - koniec pracy");
            return;
        }

        int count = edu.getCount();
        double avg = edu.getAvg();

        System.out.println("Liczba studentów: " + count);
        System.out.println("Średnia ocen: " + avg);

        edu.rankByGrade();
        edu.printData();
    }

}

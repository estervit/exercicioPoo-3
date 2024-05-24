package run;

import scool.Study;

import java.util.Scanner;

public class studyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Study study = new Study();

        System.out.println("Name study: ");
        study.nameStudy = sc.nextLine();

        System.out.println("Points: 1 ,2 and 3 -> ");
        study.nota =sc.nextDouble();
        study.nota2 =sc.nextDouble();
        study.nota3 =sc.nextDouble();

        System.out.println("Final grade: " + study.finalNota());

        if (study.finalNota() < 60.0){
            System.out.println("Faleid");
            System.out.println("Missing: " + study.missingPoints());
        }else {
            System.out.println("You passed");
        }

        sc.close();
    }
}

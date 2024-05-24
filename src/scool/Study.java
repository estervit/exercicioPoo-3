package scool;

public class Study {

    public String nameStudy;
    public double nota;
    public double nota2;
    public double nota3;

    public double finalNota(){
        return nota + nota2 + nota3;
    }
    public double missingPoints(){
        if (finalNota() < 60.0) {
            return 60.0 -finalNota();
        }else {
            return 0.0;
        }
    }
}
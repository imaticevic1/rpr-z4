package ba.unsa.etf.rpr.Tutorijal4;

public class Upis {
    private PlanStudija plan;
    private Student student;
    private Predmet predmet;

    public Upis(Student student, Predmet predmet) {
        this.student = student;
        this.predmet = predmet;
    }

    public PlanStudija getPlan() {
        return plan;
    }

    public Student getStudent() {
        return student;
    }

    public Predmet getPredmet() {
        return predmet;
    }
}


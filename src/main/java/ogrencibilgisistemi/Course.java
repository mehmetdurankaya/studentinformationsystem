package ogrencibilgisistemi;

public class Course {
    Teacher courseTeacher;
    Student mat;
    Student fizik;
    Student kimya;
    String name;
    String code;
    String prefix;
    double note;
    double verbalGradeNote;
    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

    private double verbalGradeNote(double verbalGradeNote) {//sözlü notu hesaplama ayrı bir metot olarak oluşturuldu
        this.verbalGradeNote=verbalGradeNote;              //encapsulation kapsüllendi
        double result=verbalGradeNote*0.20;
        return result;
    }
    private double examGradeNote(double note) {//Sınav notu hesaplama olarak metod oluşturuldu.
        this.note=note;                        //encapsulation kapsüllendi
        double result=note*0.80;
        return result;
    }


    public double lessonAvarege(double verbalGradeNote,double note) {
        this.verbalGradeNote=verbalGradeNote;
        this.note=note;
        double result;
        result=verbalGradeNote(verbalGradeNote)+examGradeNote(note);
        return result;
    }




}



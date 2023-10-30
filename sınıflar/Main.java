package sınıflar;

public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik","MAT101","MAT");
        Course fizik = new Course("Fizik","FZK101","FZK");
        Course kimya = new Course("Kimya","KMY101","KMY");

        Teacher t1 = new Teacher("Mahmut Hoca","90550000000","MAT");
        Teacher t2 = new Teacher("Fatma Ayşe","90550000001","FZK");
        Teacher t3 = new Teacher("Ali Veli","90550000002","KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Stundent s1 = new Stundent("İnek Şaban", 4,"140144015",mat,fizik,kimya);
        s1.addbulExamNote(50,20,40);
        s1.isPass();

        Stundent s2 = new Stundent("Güdük Necmi", 4,"2211133",mat,fizik,kimya);
        s2.addbulExamNote(100,50,40);
        s2.isPass();

        Stundent s3 = new Stundent("Hayta İsmail", 4,"221121312",mat,fizik,kimya);
        s3.addbulExamNote(50,20,40);
        s3.isPass();

    }
}

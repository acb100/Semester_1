package MyGroup;

public class TestMyGroup {

    public static void run(){
        Member m1 = new Member("Svend", Gender.MALE, 82637454, "javaerfedt@gmail.com");
        Member m2 = new Member("Bo", Gender.MALE, 73645829, "alucard@gmail.com");
        Member m3 = new Member("Peter", Gender.MALE, 88888888, "harboeøl@gmail.com");
        Member m4 = new Member("Anne", Gender.FEMALE, 27364536, "svendspølse@hotmail.com");

        System.out.println(m1.getName() + " " + m1.getGender() + " " + m1.getPhone() + " " + m1.getEmail());
        System.out.println(m2.getName() + " " + m2.getGender() + " " + m2.getPhone() + " " + m2.getEmail());
        System.out.println(m3.getName() + " " + m3.getGender() + " " + m3.getPhone() + " " + m3.getEmail());
        System.out.println(m4.getName() + " " + m4.getGender() + " " + m4.getPhone() + " " + m4.getEmail());
    }

    public static void main(String[] args) {
        run();
    }
}

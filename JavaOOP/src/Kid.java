public class Kid {
    private String name;
    private int yearOfBirth;

    public Kid(String n, int y){
        this.name = n;
        this.yearOfBirth = y;
    }
    public String getName() {
        return this.name;
    }
    public int getYearOfBirth(){
        return this.yearOfBirth;
    }

    @Override
    public String toString() {
        return name + " " + yearOfBirth;
    }
}

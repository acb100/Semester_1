package MyGroup;

public class Member {
    private String name;
    private int phone;
    private String email;
    private Gender gender;

    public Member(String name, Gender gender, int phone, String email) {
        setName(name);
        setPhone(phone);
        setEmail(email);
        setGender(gender);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(Gender gender){
        this.gender = gender;
    }
    public Gender getGender(){
        return gender;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}

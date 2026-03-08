package starter.model;

public class User {
    private String name;
    private String lastName;
    private String age;
    private String email;
    private String country;

    public User() {
    }

    public User(String name, String lastName, String age, String email, String country) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

package day13;

public class User {
    private Long id;
    private String name;
    private String email;

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void printInfo() {
        System.out.println(
            "ID: "+id+
            ", 이름: " +name+
            ", 이메일: "+email
        );
    }
}

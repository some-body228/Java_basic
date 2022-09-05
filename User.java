public class User {
    private String name;

    private UserConfiguration configuration;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(UserConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", configuration=" + configuration +
                ", age=" + age +
                '}';
    }
}

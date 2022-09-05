import java.util.Random;

public class UserConfiguration {
    private String configuration;

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    @Override
    public String toString() {
        return "UserConfiguration{" +
                "configuration='" + configuration + '\'' +
                '}';
    }
}

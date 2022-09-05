import Exeptions.FillUserException;
import Exeptions.ParseExeption;
import sourses.Configuration;
import sourses.Database;
import sourses.Parser;

public class HomeWork {
    public static void main(String[] args) {
        User user = new User();
        //оповещение об ошибке
        fillUserName(user);
        // rethrow ошибки
        try {
            fillUserConfiguration(user);
        } catch(Exception e) {
            System.out.println("Ошибка заполнения конфигураций" + e);
        }
        //подавление ошибки
        fillAge(user);

        System.out.println(user);

    }

    private static void fillAge(User user) {
        try(Database database = new Database()) {
            user.setAge(database.getAge());
        } catch (Exception e) {
        }
    }

    private static void fillUserConfiguration(User user) {
        try {
            Configuration configuration = new Configuration();
            UserConfiguration userConfiguration = new UserConfiguration();
            userConfiguration.setConfiguration(parseUserConfiguration(configuration.readFile()));
            user.setConfiguration(userConfiguration);
        } catch (Exception e) {
            throw new FillUserException("Ошибка при заполнении конфигураций" + e);
        }
    }

    private static String parseUserConfiguration(String config) {
        Parser parser = new Parser();
        try {
            return parser.parse(config);
        } catch (Exception e){
            throw new ParseExeption("Ошибка при парсиге:" + e);
        }

    }

    public static void fillUserName(User user){
        try(Database database = new Database()) {
                user.setName(database.getUserName());
        } catch (Exception e) {
            System.out.println("Ошибка заполнения пользователя: " + e);
        }
    }
}
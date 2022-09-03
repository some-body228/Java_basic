import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        List<Account> accounts1 = new ArrayList<>(Arrays.asList(
                new Account(1),
                new Account(2),
                new Account(3)
        ));
        List<Account> accounts2 = new ArrayList<>(Arrays.asList(
                new Account(4),
                new Account(5),
                new Account(6)
        ));
        List<Account> accounts3 = new ArrayList<>(Arrays.asList(
                new Account(7),
                new Account(8),
                new Account(9)
        ));
        List<Account> accounts4 = new ArrayList<>(Arrays.asList(
                new Account(10),
                new Account(11),
                new Account(12)
        ));

        HashMap<Client,List<Account>> clients = new HashMap<>();
        clients.put(
                new Client("первый", 18),
                accounts1
        );
        clients.put(
                new Client("второй", 20),
                accounts2
        );
        clients.put(
                new Client("третий", 22),
                accounts3
        );
        clients.put(
                new Client("четвертый", 24),
                accounts4
        );

        Bank bank = new Bank(clients);

        System.out.println(bank.findClient(accounts2.get(2)).toString());
        System.out.println(bank.findClient(accounts2.get(1)).toString());
        System.out.println(bank.findClient(accounts2.get(0)).toString());

        System.out.println(bank.findClient(accounts4.get(2)).toString());
        System.out.println(bank.findClient(accounts4.get(2)).toString());
        System.out.println(bank.findClient(accounts4.get(2)).toString());

        System.out.println(bank.getAccounts(new Client("первый", 18)).toString());
        System.out.println(bank.getAccounts(new Client("второй", 20)).toString());
        System.out.println(bank.getAccounts(new Client("третий", 22)).toString());



    }
}
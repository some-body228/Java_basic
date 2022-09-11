import java.util.List;
import java.util.Map;
import java.util.Set;

public class Bank {
    private final Map<Client, List<Account>> clients;

    private final Map<Account, Client> accounts;

    public Bank(Map<Client, List<Account>> clients, Map<Account, Client> accounts) {
        this.clients = clients;
        this.accounts = accounts;
    }

    public List<Account> getAccounts(Client client){
        return clients.get(client);
    }
    public Client findClient(Account account){ return accounts.get(account);}
}

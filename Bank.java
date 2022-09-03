import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Bank {
    private final Map<Client,List<Account>> clients;

    public Bank(Map<Client, List<Account>> clients) {
        this.clients = clients;
    }

    public List<Account> getAccounts(Client client){
        return clients.get(client);
    }
    public Client findClient(Account account){
        Set<Map.Entry<Client, List<Account>>> entries = clients.entrySet();
        for (Map.Entry<Client, List<Account>> entry : entries) {
            if (entry.getValue().contains(account)) {
                return entry.getKey();
            }
        }
        return null;
    }
}

import java.util.Objects;

public class Account {
    private final Integer coins;

    public Account(Integer coins) {
        this.coins = coins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(coins, account.coins);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coins);
    }

    @Override
    public String toString() {
        return "Account{" +
                "coins=" + coins +
                '}';
    }
}

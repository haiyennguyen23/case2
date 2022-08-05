package login;

public class User {
    private String Account;
    private String Password;

    public User() {
    }

    public User(String Account, String Password) {
        this.Account = Account;
        this.Password = Password;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        this.Account = account;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
}

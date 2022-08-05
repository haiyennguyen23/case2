package login;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usermanager {
    User user = new User();
    public void Register(String account, String passwork) {
        user.setAccount(account);
        user.setPassword(passwork);

    }

    public User Login(String account, String passwork){
        if (user.getAccount().equals(account) && user.getPassword().equals(passwork)) {
            return user;
        } else {
            return null;
        }

    }
    public boolean validateAccount(String regex) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{1,6}$");
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean validatePassWork(String regex) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{1,6}$");
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
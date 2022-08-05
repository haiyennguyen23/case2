package login;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usermanager {
    User user = new User();
    public void dangKy(String tk, String mk) {
        user.setTaiKhoan(tk);
        user.setMatKhau(mk);

    }

    public User dangNhap(String tk, String mk){
        if (user.getTaiKhoan().equals(tk) && user.getMatKhau().equals(mk)) {
            return user;
        } else {
            return null;
        }

    }
    public boolean validateTk(String regex) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{1,6}$");
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean validateMk(String regex) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{1,6}$");
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
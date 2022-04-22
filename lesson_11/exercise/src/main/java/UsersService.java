import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsersService {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<User> users = new ArrayList<User>();
    public static User activeUser;
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean login(String username, String password) {
        boolean loginSuccess = false;
        for (User user: users) {
            if (user.userName.toLowerCase().equals(username.trim().toLowerCase())) {
                if (PasswordService.checkPassword(password, user.password)) {
                    activeUser = user;
                    loginSuccess = true;
                    break;
                }
            }
        }
        return loginSuccess;
    }

    public static boolean register(User user) {
        boolean created = false;
        boolean isValidEmail = validateFormatEmail(user.email);
        boolean isAvailableEmail = checkExistEmail(user.email);
        if (!isAvailableEmail && isValidEmail) {
            user.password = PasswordService.hashPassword(user.password);
            users.add(user);
            created = true;
        }
        return created;
    }

    public static boolean setActiveUser(User user) {
        activeUser = user;
        return true;
    }

    public static boolean updateUserInfo(String value, UserField field) {
        boolean updateStatus = false;
        switch (field) {
            case USER_NAME -> {
                activeUser.userName = value;
                updateStatus = true;
            }
            case PASSWORD -> {
                activeUser.password = PasswordService.hashPassword(value);
                updateStatus = true;
            }
            case EMAIL -> {
                boolean isValidEmail = validateFormatEmail(value);
                boolean isAvailableEmail = checkExistEmail(value);
                if (!isAvailableEmail && isValidEmail) {
                    activeUser.email = value;
                    updateStatus = true;
                }
            }
        }
        return updateStatus;
    }

    public static boolean validateFormatEmail(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
    }

    public static boolean checkExistEmail(String email) {
        boolean existed = false;
        for (User user: users) {
            if (user.email.toLowerCase().equals(email.toLowerCase())) {
                existed = true;
                break;
            }
        }
        return existed;
    }

    public static void resetUserData() {
        users.clear();
    }
}

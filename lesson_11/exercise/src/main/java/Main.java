import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("---------------------------------");
                System.out.println("------     MAIN MENU     --------");
                System.out.println("---------------------------------");
                System.out.println("Please choose your option: ");
                System.out.println("1. Login");
                System.out.println("2. Registration");
                int option = Integer.parseInt(sc.nextLine());
                if (option != 1 && option != 2) {
                    throw new MainMenuException("Your choose is out of options!");
                }
                if (option == 1) {
                    login();
                } else {
                    register();
                }
            } catch (MainMenuException e) {
                System.out.println(e.getMessage());
                System.out.println("Please reselect");
            } catch (NumberFormatException e) {
                System.out.println("Please reselect");
            }
        }
    }

    public static void wrongPasswordMenu() {
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("---------------------------------");
                System.out.println("----  WRONG PASSWORD MENU -------");
                System.out.println("---------------------------------");
                System.out.println("You has been login with wrong password!");
                System.out.println("1. Re-login");
                System.out.println("2. Forgot password");
                int option = Integer.parseInt(sc.nextLine());
                if (option != 1 && option != 2) {
                    throw new MainMenuException("Your choose is out of options!");
                }
                flag = false;
                if (option == 1) {
                    login();
                } else {
                    forgotPassword();
                }
            } catch (MainMenuException e) {
                System.out.println(e.getMessage());
                System.out.println("Please reselect");
            } catch (NumberFormatException e) {
                System.out.println("Please reselect");
            }
        }
    }

    public static void successMenu() {
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("---------------------------------");
                System.out.println("---------  SUCCESS MENU ---------");
                System.out.println("---------------------------------");
                System.out.println("Please choose your option: ");
                System.out.println("1. Change your username");
                System.out.println("2. Change your email");
                System.out.println("3. Change your password");
                System.out.println("4. Logout");
                System.out.println("5. Exit");
                int option = Integer.parseInt(sc.nextLine());
                if (option > 5 || option < 1) {
                    throw new MainMenuException("Your choose is out of options!");
                }
                switch (option) {
                    case 1 -> {
                        System.out.println("You've selected change your username:");
                        String username = inputUsername();
                        updateUserInfo(UserField.USER_NAME, username);
                    }
                    case 2 -> {
                        System.out.println("You've selected change your email:");
                        String email = inputEmailRegister();
                        updateUserInfo(UserField.EMAIL, email);
                    }
                    case 3 -> {
                        System.out.println("You've selected change your password");
                        String password = inputPassword();
                        updateUserInfo(UserField.PASSWORD, password);
                    }
                    case 4 -> {
                        System.out.println("You've selected logout!");
                        UsersService.activeUser = null;
                        flag = false;
                    }
                    case 5 -> {
                        System.out.println("Thanks you! Bye");
                        System.exit(0);
                    }
                }
            } catch (MainMenuException e) {
                System.out.println(e.getMessage());
                System.out.println("Please reselect");
            } catch (NumberFormatException e) {
                System.out.println("Please reselect");
            }
        }
    }

    public static boolean register() {
        boolean flag = true;
        boolean createUser = false;
        while (flag) {
            System.out.println("---------------------------------");
            System.out.println("--------  REGISTER SCREEN -------");
            System.out.println("---------------------------------");

            User user = new User();
            user.userName = inputUsername();
            user.email = inputEmailRegister();
            user.password = inputPassword();
            createUser = UsersService.register(user);
            if (createUser) {
                flag = false;
            }
        }
        if (createUser) {
            System.out.println("--- REGISTER SUCCESS! ---");
        }
        return createUser;
    }

    public static boolean login() {
        boolean loginStatus = false;
        System.out.println("---------------------------------");
        System.out.println("---------   LOGIN SCREEN  -------");
        System.out.println("---------------------------------");

        String userName = inputUsername();
        String password = inputPassword();
        loginStatus = UsersService.login(userName, password);
        if (loginStatus) {
            System.out.println("--- LOGIN SUCCESS! ---");
            successMenu();
        } else {
            wrongPasswordMenu();
        }
        return loginStatus;
    }

    public static boolean updateUserInfo(UserField field, String value) {
        User user = UsersService.activeUser;
        switch (field)  {
            case EMAIL -> user.email = value;
            case PASSWORD -> user.password = value;
            case USER_NAME -> user.userName = value;
        }
        System.out.println("You've updated success your information!");
        System.out.println(user);
        return true;
    }

    public static boolean logout() {
        UsersService.activeUser = null;
        return true;
    }

    public static boolean forgotPassword() {
        boolean flag = true;
        String email = "";
        while (flag) {
            try {
                System.out.println("Please type your email:");
                email = sc.nextLine().trim();
                if (email.length() == 0) {
                    throw new EmailException("email can't be null!");
                }
                boolean validFormatEmail = UsersService.validateFormatEmail(email);
                if (!validFormatEmail) {
                    throw new EmailException("email is invalid");
                }
                flag = false;
            } catch (EmailException e) {
                System.out.println(e.getMessage());
            }
        }
        return true;
    }

    public static String inputUsername() {
        boolean flag = true;
        String username = "";
        while (flag) {
            try {
                System.out.println("Please type your username:");
                username = sc.nextLine().trim();
                if (username.length() == 0) {
                    throw new UserNameException("username can't not be null!");
                }
                flag = false;
            } catch (UserNameException e) {
                System.out.println(e.getMessage());
            }
        }
        return username;
    }

    public static String inputEmailRegister() {
        boolean flag = true;
        String email = "";
        while (flag) {
            try {
                System.out.println("Please type your email:");
                email = sc.nextLine().trim();
                if (email.length() == 0) {
                    throw new EmailException("email can't be null!");
                }
                boolean validFormatEmail = UsersService.validateFormatEmail(email);
                if (!validFormatEmail) {
                    throw new EmailException("email is invalid");
                }
                boolean existedEmail = UsersService.checkExistEmail(email);
                if (existedEmail) {
                    throw new EmailException("This email is existed! Please use another email");
                }
                flag = false;
            } catch (EmailException e) {
                System.out.println(e.getMessage());
            }
        }
        return email;
    }


    public static String inputPassword() {
        boolean flag = true;
        String password = "";
        while (flag) {
            try {
                System.out.println("Please type your password");
                password = sc.nextLine().trim();
                if (password.length() == 0) {
                    throw new Exception("password can't be null!");
                }
                flag = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return password;
    }
}

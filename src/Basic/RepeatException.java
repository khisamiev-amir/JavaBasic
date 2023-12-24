package Basic;

//import Basic.Exceptions.WrongLoginException;
//import Basic.Exceptions.WrongPasswordException;
import Basic.Exceptions.*;//* импортирую все классы из Basic.Exceptions

public class RepeatException {
    public static void main(String[] args) {

        getLoginPasswordConfirmPassword("ASdsad", "asdasd111111!!", "asdasd");
    }

    public static boolean getLoginPasswordConfirmPassword(String login, String password, String confirmPassword) {
        boolean loginResult = true;
        boolean passwordResult = true;
        try {

            boolean checkSymbol = login.matches("^[a-zA-Z0-9_]+$");

            if (!(checkSymbol && 19 > login.length())) {
                WrongLoginException  a = new WrongLoginException("Не верный логин");
                throw a;//throw - выкинуть исключение
            }

            boolean checkSymbolPassword = password.matches("^[a-zA-Z0-9_]+$");

            if (!(checkSymbolPassword && 19 > password.length() && password.equals(confirmPassword))) {
                throw new WrongPasswordException("Не верный пароль");
            }

        } catch (WrongLoginException a) { //аналогично методу подаем входные данные //название потому что создаем объект экспешна
            System.out.println(a.getMessage());
            loginResult = false;
        }
        catch (WrongPasswordException wpe) { //аналогично методу подаем входные данные //название потому что создаем объект экспешна
            System.out.println(wpe.getMessage());
            passwordResult = false;
        }
        boolean result = loginResult && passwordResult;
        return result;
    }
}
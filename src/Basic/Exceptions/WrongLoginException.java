package Basic.Exceptions;

public class WrongLoginException extends Exception{//вот так создаем эксепшны
    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {//конструктор по умолчанию, даёт возможность создавать объект без параметров
    }
}

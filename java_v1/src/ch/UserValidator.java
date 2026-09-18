package ch;

public class UserValidator {
    static final int SUCCESS = 0;
    static final int INVALID_LENGTH = 1;
    static final int INVALID_FORMAT = 2;

    public static int validateId(String id) {
        if (id == null || id.length() < 12) {
            return INVALID_LENGTH;
        }
        if (!id.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")){
            return INVALID_FORMAT;
        }
        return SUCCESS;
    }

    public static int validatePassword(String password) {
        if (password == null || password.length() < 8) {
            return INVALID_LENGTH;
        }
        if (!password.matches("^[a-zA-Z0-9]+$")){
            return INVALID_FORMAT;
        }
        return SUCCESS;
    }
}


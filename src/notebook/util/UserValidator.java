package notebook.util;

import notebook.model.User;

public class UserValidator {
    public User validate(User user) {
        // A N n a
        String name = user.getFirstName().replace(" ", "").trim();
        String lastName = user.getLastName().replace(" ", "").trim();
        user.setFirstName(name);
        user.setLastName(lastName);
        return user;
    }
}

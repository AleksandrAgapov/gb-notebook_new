package notebook.util;

import notebook.model.User;

public class UserValidator {

    public User validate(User user) {
//  A N n a

        String name = user.getFirstName().replaceAll(" ","").trim();


        String Lastname = user.getLastName().replaceAll(" ","").trim();

        user.setFirstName(name);
        user.setLastName(Lastname);


        return user;
    }
}
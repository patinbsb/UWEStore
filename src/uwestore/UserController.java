/*
 * 
 */
package uwestore;

import java.util.ArrayList;

/**
 *
 * @author Patrick Goodson
 */
public class UserController
{
    // As only one instance of this class is required, we make the
    // methods and attributes static
    private static ArrayList<User> userList;
    private static User currentLogin;
    
    public static void UserController()
    {
        userList = new ArrayList<>();
        // No user currently selected
        currentLogin = null;
        // Adding test data
        addNewUser("kun");
        addNewUser("julia");
    }

    public static void addNewUser(String name)
    {
        // As test data does not require email and address the superclass User
        // Is used
        userList.add(new User (name));
    }

    public static ArrayList<User> getUserList()
    {
        return userList;
    }

    public static void setUserList(ArrayList<User> userList)
    {
        UserController.userList = userList;
    }

    public static User getCurrentLogin()
    {
        return currentLogin;
    }

    public static void setCurrentLogin(User currentLogin)
    {
        UserController.currentLogin = currentLogin;
    }
    
    public static void login (String user)
    {
        for (User member : userList)
        {
            if (member.getName().equals(user))
            {
                setCurrentLogin(member);
            }
        }
        ItemController.setBasketList(new ArrayList<>());
    }
    
    static void logout()
    {

    }
}

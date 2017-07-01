/*
 * 
 */
package uwestore;

/**
 *
 * @author Patrick Goodson
 */
public class Student extends User
{
    private String email;
    private String address;
    
    public Student(String name, String email, String address)
    {
        super(name);
        this.email = email;
        this.address = address;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    
}

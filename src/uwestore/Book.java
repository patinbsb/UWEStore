/*
 * 
 */
package uwestore;

/**
 *
 * @author Patrick Goodson
 */
public class Book extends Item
{
    private int price;
    public Book(String title, int price)
    {
        super(title);
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
    
}

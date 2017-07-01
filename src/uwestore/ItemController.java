/*
 * 
 */
package uwestore;

import java.util.ArrayList;

/**
 *
 * @author Patrick Goodson
 */
public class ItemController
{
    // As only one instance of this class is required, we make the
    // methods and attributes static
    private static ArrayList<Book> itemList;
    private static ArrayList<Item> basketList;


    public static void ItemController()
    {
        itemList = new ArrayList<>();
        basketList = new ArrayList<>();
        // Populating itemList with testdata
        addNewItem("Programming in Java", 35);
        addNewItem("Software Engineering", 30);
        addNewItem("UML", 37);
        addNewItem("Requirements engineering", 2);
    }

    // Adds an item to the itemList
    public static void addNewItem(String title, int price)
    {
        //Currently Books are the only required item.
        itemList.add(new Book (title, price));
    }
    
    // Removes an item from the itemList
    public static void removeItem (String title)
    {
        for (Item item : itemList)
        {
            if (item.getTitle().equals(title))
            {
                itemList.remove(item);
            }
        }
    }
    
    // Adds an item to the customers basket
    public static void addToBasket(String title)
    {
        // We only need the title to compare the basket with the item list.
        // Therefore the Superclass Item is used.
        basketList.add(new Item (title));
    }
    
    // Removes an item from the customers basket
    public static void removeFromBasket (String title)
    {
        for (Item item : basketList)
        {
            if (item.getTitle().equals(title))
            {
                basketList.remove(item);
            }
        }
    }
    
    //Returns true if an item is present in the customers basket
    public static boolean itemInBasket(Item item)
    {
        for (Item basketItem : basketList)
        {
            if (basketItem.equals(item))
            {
                return true;
            }
        }
        return false;
    }
    
    // Removes any items from the itemList that are present in the customers 
    // basket, then logs the user out
    public static void checkout()
    {
        for (Item item : itemList)
        {
            if (itemInBasket(item))
            {
                itemList.remove(item);
            }
        }
        UserController.logout();
    }
    
    public static ArrayList<Book> getItemList()
    {
        return itemList;
    }

    public static void setItemList(ArrayList<Book> itemList)
    {
        ItemController.itemList = itemList;
    }

    public static ArrayList<Item> getBasketList()
    {
        return basketList;
    }

    public static void setBasketList(ArrayList<Item> basketList)
    {
        ItemController.basketList = basketList;
    }

}

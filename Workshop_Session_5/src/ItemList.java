import java.util.ArrayList;

public class ItemList
{
  private ArrayList<Item> items;

  public ItemList()
  {
    items = new ArrayList<Item>();
  }

  public void addItem(Item item)
  {
    items.add(item);
  }

  public Item getItem(int index)
  {
    return items.get(index);
  }

  public Item[] getAllItems()
  {
    return items.toArray(new Item[items.size()]);
  }

  public Item[] getAllItems(String type)
  {
    int counter = 0;
    Item[] itemsArray = new Item[items.size()];
    for (int i = 0; i < items.size(); i++)
      if (items.get(i).getType().equals(type))
        itemsArray[counter++] = items.get(i).copy();
    return itemsArray;
  }

  public double getTotalPrice()
  {
    double sum = 0;
    for (int i = 0; i < items.size(); i++)
      sum += items.get(i).getPrice();
    return sum;
  }
}

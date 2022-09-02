import java.util.ArrayList;

public class SiteCollection
{
  private int size;
          ArrayList<Website> webSite;

  public SiteCollection(int maxSites)
  {
    webSite = new ArrayList<Website>();
    size = maxSites;
  }

  public int getNumberOfSites()
  {
    return webSite.size();
  }

  public int getNumberOfUpdatedSites()
  {
    int counter = 0;
    for (int i = 0; i < getNumberOfSites(); i++)
      if (!webSite.get(i).needsUpdate())
        counter++;
    return counter;
  }

  public void addSite(Website site)
  {
    if (getNumberOfSites() < size)
      webSite.add(site);
  }

  public void removeSite(String url)
  {
    for (int i = 0; i < getNumberOfSites(); i++)
      if (webSite.get(i).getUrl().equals(url))
        webSite.remove(i);
  }

  public Website[] getAllSites()
  {
    return webSite.toArray(new Website[getNumberOfSites()]);
  }

  public Website[] getAllNotUpdatedSites()
  {
    Website[] temp = new Website[getNumberOfSites() - getNumberOfUpdatedSites()];
    int counter = 0;
    for (int i = 0; i < getNumberOfSites(); i++)
      if (webSite.get(i).needsUpdate)
        temp[counter++] = webSite.get(i);
    return temp;
  }

  public String toString()
  {
    String str = "The maximum size is: " + size + "\n";
    for (int i = 0; i < getNumberOfSites(); i++)
      str += "\t" + (i + 1) + ". " + webSite.get(i) + "\n";
    return str;
  }
}

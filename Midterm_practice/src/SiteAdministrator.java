public class SiteAdministrator
{
  private String name;
  SiteCollection siteCollection;

  public SiteAdministrator(String name)
  {
    this.name = name;
    siteCollection = new SiteCollection(100);
  }

  public String getName()
  {
    return name;
  }

  public SiteCollection getSiteCollection()
  {
    return siteCollection;
  }

  public Website getNextSiteToUpdate()
  {
    if (siteCollection.getAllNotUpdatedSites().length > 0)
    {
      Website temp = siteCollection.getAllNotUpdatedSites()[0];
      siteCollection.getAllNotUpdatedSites()[0].markAsUpdated();
      return temp;
    }
    return null;
  }

  public Website[] getAllSitesToUpgrade()
  {
    Website[] temp = new Website[siteCollection.getAllNotUpdatedSites().length],
              needsUpdate = new Website[siteCollection.getAllNotUpdatedSites().length];
    for (int i = 0; i < temp.length; i++)
    {
      siteCollection.getAllNotUpdatedSites()[i].markAsUpdated();
      temp[i] = needsUpdate[i];
    }
    return temp;
  }
}

public class CompanyTest
{
  public static void main(String[] args)
  {
    URL url1 = new URL("com", "example", "home/index.html");
    URL url2 = new URL("com", "google");
    Website website1 = new Website(url1, "dogs");
    Website website2 = new Website(url2, "everything");
    Company company1 = new Company("Crazy Cats", "London");
    Company company2 = new Company("Google Inc", "San Francisco");
    Company company3 = new Company("Bad Company", "Las Vegas");

    company1.createWebsite(website1);
    company2.createWebsite(website2);
    website1.setContent("cats");
    System.out.println(company1);
    System.out.println(company2);
    System.out.println(company3);
  }
}

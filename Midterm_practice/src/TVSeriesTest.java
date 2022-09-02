public class TVSeriesTest
{
  public static void main(String[] args)
  {
    Actor actor1 = new Actor("Benedict Cumberbatch");
    TVSeries tvSeries1 = new TVSeries("What if...?");
    System.out.println(tvSeries1);

    tvSeries1.hireActor(actor1);
    tvSeries1.hireActor(new Actor("Hayley Atwell"));
    tvSeries1.makeNextEpisode();
    tvSeries1.makeNextEpisode();
    System.out.println(tvSeries1);

    tvSeries1.awardEmmy("Benedict Cumberbatch");
    tvSeries1.awardEmmy("Benedict Cumberbatch");
    tvSeries1.awardEmmy("Hayley Atwell");

    System.out.println(tvSeries1.getEmmyWinners().get(1).getName());
    System.out.println(tvSeries1.getEmmyWinners().get(1).getNumberOfEmmys());
  }
}

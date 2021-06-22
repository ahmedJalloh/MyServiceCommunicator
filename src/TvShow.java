public class TvShow extends ServiceCommunicator{

    public static void main(String[] args){

        System.out.println(new TvShow("Fresh Prince of Bel-Air").get());
    };
    public TvShow(String tvShow) {
        super("http://api.tvmaze.com/singlesearch/shows?q=" + tvShow);
    }
}

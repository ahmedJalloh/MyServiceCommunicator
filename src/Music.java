public class Music extends ServiceCommunicator {

    public Music(String artistOrSongTitle) {
        super("https://itunes.apple.com/search?term=" + artistOrSongTitle + "\\&limit=1");
    }


    public static void main(String[] var){


        System.out.println(new Music("jay-z").get());
    };
}

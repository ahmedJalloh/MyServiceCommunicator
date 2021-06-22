public class ZipCode extends ServiceCommunicator{


    public static void main(String[] var){


        System.out.println(new ZipCode("43201").get());
    };

    public ZipCode(String zipcode) {
        super("http://api.zippopotam.us/us/" + zipcode);
    }
}

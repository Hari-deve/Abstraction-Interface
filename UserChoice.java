import java.util.Scanner;

public class UserChoice {
    static Scanner choose=new Scanner(System.in);
    public static void main(String[] args) {
        Menu chickenBiryani=new ChickenBiryani("Thaalcha","Chicken Biryani","Half Tandoori",290);
        Menu muttonBiryani=new MuttonBiryani("Thaalcha","Mutton Biryani","Liver Roast",460);
        Menu vegetableBiryani=new VegetableBiryani("Paneer Tikka","Vegetable Biryani","Gobi Manchurian",220);
        System.out.println("Welcome to our Hotel KK Biryani\nPlease view our menu and select one\n1.Chicken Biryani\n2.Mutton Biryani\n3.Vegetable Biryani");
        int selectMenu=choose.nextInt();
        if (selectMenu==1){
            chickenBiryani.combo();
            chickenBiryani.combo();
        } else if (selectMenu==2) {
            muttonBiryani.combo();
            muttonBiryani.feedback();
        } else if (selectMenu==3) {
            vegetableBiryani.combo();
            vegetableBiryani.feedback();
        }else{
            System.out.println("Please Select Options as given");
        }
    }
}

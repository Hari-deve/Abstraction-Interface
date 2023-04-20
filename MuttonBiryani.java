import java.util.Scanner;

public class MuttonBiryani extends Menu {
    static Scanner userMessage=new Scanner(System.in);
    public MuttonBiryani(String sideDish, String mainDish, String comboOffer, double price) {
        super(sideDish, mainDish, comboOffer, price);
    }

    @Override
    public void combo() {
        System.out.println("Please look at the combo provided");
        System.out.println("Main course: "+mainDish);
        System.out.println("Side course: "+sideDish);
        System.out.println("Combo Offer: "+comboOffer);
        System.out.println("Total Cost :"+price);
        System.out.println("Enjoy your Meal");
    }

    @Override
    public void feedback() {
        System.out.println("Please give your valuable feedback regarding our service ");
        String feedback=userMessage.nextLine();
        System.out.println("Thanks for your Feedback \nVisit Again");

    }
}

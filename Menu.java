abstract public class Menu {
    String sideDish;
    String mainDish;
    String comboOffer;
    double price;
    abstract public void combo();
    abstract public void feedback();

    public Menu(String sideDish, String mainDish, String comboOffer, double price) {
        this.sideDish = sideDish;
        this.mainDish = mainDish;
        this.comboOffer = comboOffer;
        this.price = price;
    }
}
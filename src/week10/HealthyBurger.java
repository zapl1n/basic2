package week10;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthyAddition1(String addition1name, double addition1price){
        this.healthyExtra1Name = addition1name;
        this.healthyExtra1Price = addition1price;
        System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Name);
    }

    public void addHealthyAddition2(String addition2name, double addition2price){
        this.healthyExtra2Name = addition2name;
        this.healthyExtra2Price = addition2price;
        System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
    }

    @Override
    public String itemizeHamburger() {
        //System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);

        String totalPrice = super.itemizeHamburger();
        //double totalPrice = Double.valueOf(totalPrice);

        if (this.healthyExtra1Name != null){
            totalPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }

        if (this.healthyExtra2Name != null){
            totalPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }

        return totalPrice;
    }
}
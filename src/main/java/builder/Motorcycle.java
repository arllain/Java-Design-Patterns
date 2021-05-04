package builder;

public class Motorcycle implements  Builder{

    private String brandName;
    private Product product;

    public Motorcycle(String brand) {
        product = new Product();
        this.brandName = brand;
    }

    @Override
    public void startUpOperations() {

    }

    @Override
    public void buildBody() {
        product.add("This is a body of a Motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("1 Headlights are added");
    }

    @Override
    public void endOperations() {
        product.add(String.format("Motorcycle model is :%s", this.brandName));
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}

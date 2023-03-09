package coffeeMachineSoftware;

public class Coffee {
    private double productPrice;
    private String product;

    public Coffee(){

    }
    public Coffee(String product,double productPrice) {
        this.setProductPrice(productPrice);
        this.setProduct(product);
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

}

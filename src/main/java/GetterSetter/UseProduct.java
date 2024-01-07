package GetterSetter;

public class UseProduct {
    public static void main(String[] args) {
        Product p=new Product();
        p.setId(101);
        p.setName("Maggie");
        p.setPrice(40.0);
        System.out.println("Product id="+p.getId());
        System.out.println("Name="+p.getName());
        System.out.println("Price="+p.getPrice());
    }
}

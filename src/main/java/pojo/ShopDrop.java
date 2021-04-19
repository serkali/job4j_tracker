package pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[products.length - 1] = null;
            products[i] = products[i + 1];

        }
        return products;

    }
}



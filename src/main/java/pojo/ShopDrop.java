package pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null && i != products.length - 1) {
                products[i] = products[i + 1];
                products[i + 1] = null;
            }

        }
        return products;
    }
}


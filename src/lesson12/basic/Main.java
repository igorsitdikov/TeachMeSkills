package lesson12.basic;

import lesson12.model.*;

public class Main {
    public static void main(String[] args) {
        Shop_list shop = new Shop_list();
        Goods milk = new Goods(1, "Milk", 2);
        Goods sugar = new Goods(3, "Sugar", 4);
        Goods bread = new Goods(2, "Bread", 1);

        try {
            shop.addProduct(milk);
            shop.addProduct(sugar);
            shop.addProduct(bread);
            shop.addProduct(bread);
        } catch (ShopAddProductException ex) {
            System.out.println(ex.getMessage());
        }

        Shop_list.show(shop.getGoodsList(SORT.PRICE));
        System.out.println();
        try {
            shop.removeProduct(4);
        } catch (ShopRemoveProductException ex) {
            System.out.println(ex.getMessage());
        }

        Shop_list.show(shop.getGoodsList(SORT.DATE));
        System.out.println();
        try {
            shop.editProduct(new Goods(3, "Dark bread", 2));
            shop.editProduct(new Goods(5, "Dark bread", 2));
        } catch (ShopUpdateProductException ex) {
            System.out.println(ex.getMessage());
        }

        Shop_list.show(shop.getGoodsList());

    }
}

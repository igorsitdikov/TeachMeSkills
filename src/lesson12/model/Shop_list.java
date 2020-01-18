package lesson12.model;

import java.util.*;

public class Shop_list {
    private List<Goods> goodsList;

    public Shop_list() {
        goodsList = new ArrayList<>();
    }

    public Shop_list(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }


    public void addProduct(Goods goods) throws ShopAddProductException {
        if (getProductPos(goods.getId()) != -1) {
            throw new ShopAddProductException("Товар с таким id уже существует");
        }
        goodsList.add(goods);
    }

    public void removeProduct(Integer id) throws ShopRemoveProductException {
        if (getProductPos(id) == -1) {
            throw new ShopRemoveProductException("Товар с таким id не существует");
        }
        goodsList.remove(getProductPos(id));
    }

    public void editProduct(Goods goods) throws ShopUpdateProductException {
        if (getProductPos(goods.getId()) == -1) {
            throw new ShopUpdateProductException("Товар с таким id не существует");
        }
        goodsList.get(getProductPos(goods.getId())).setName(goods.getName());
        goodsList.get(getProductPos(goods.getId())).setPrice(goods.getPrice());
    }

    public List<Goods> getGoodsList() {
        return getGoodsList(SORT.DEFAULT);
    }

    public List<Goods> getGoodsList(SORT sort) {
        List<Goods> list = null;
        switch (sort) {
            case ID: {
                list = new ArrayList<>(this.goodsList);
                list.sort((o1, o2) -> o2.getId() - o1.getId());
            }
            break;
            case DATE: {
                list = new ArrayList<>(this.goodsList);
                Collections.reverse(list);
            }
            break;
            case PRICE: {
                list = new ArrayList<>(this.goodsList);
                list.sort(Comparator.comparingInt(Goods::getPrice));
            }
            break;
            default:
                list = new ArrayList<>(this.goodsList);
                break;
        }
        return list;
    }

    public static <T extends Goods> void show(Set<T> set) {
        set.forEach(el -> System.out.println(el.getId() + " " + el.getName() + " " + el.getPrice()));
    }

    public static <T extends Goods> void show(List<T> list) {
        list.forEach(el -> System.out.println("\t-> " + el.getId() + " " + el.getName() + " " + el.getPrice()));
    }

    public static <T extends Goods> void show(Map<Integer, T> set) {
        set.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v.getId() + " " + v.getName() + " " + v.getPrice()));
    }

    private int getProductPos(Integer id) {
        for (int i = 0; i < this.goodsList.size(); ++i) {
            if (this.goodsList.get(i).getId() == id) return i;
        }
        return -1;
    }
}

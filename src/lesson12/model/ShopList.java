package lesson12.model;

import java.util.*;

public class ShopList {
    private List<Goods> goodsList;

    public ShopList() {
        goodsList = new ArrayList<>();
    }

    public ShopList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }


    public void addProduct(Goods goods) throws ProductAlreadyExist {
        if (goodsList.indexOf(goods) != -1) {
            throw new ProductAlreadyExist("Товар с таким id уже существует");
        }
        goodsList.add(goods);
    }

    public void removeProduct(Integer id) throws ProductNotFound {
        Goods buffer = new Goods(id, null, null);
        int pos = goodsList.indexOf(buffer);
        if (pos == -1) {
            throw new ProductNotFound("Товар с таким id не существует");
        }
        goodsList.remove(pos);
    }

    public void editProduct(Goods goods) throws ProductAlreadyExist {
        int pos = goodsList.indexOf(goods);
        if (pos == -1) {
            addProduct(goods);
        } else {
            goodsList.get(pos).setName(goods.getName());
            goodsList.get(pos).setPrice(goods.getPrice());
        }
    }

    public List<Goods> getGoodsList() {
        return getGoodsList(Sort.DEFAULT);
    }

    public List<Goods> getGoodsList(Sort sort) {
        List<Goods> list;
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

}

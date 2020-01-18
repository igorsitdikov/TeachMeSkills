package lesson12.model;

import java.util.*;

public class Shop {
    private Map<Integer, Goods> goodsList;

    public Shop() {
        this.goodsList = new HashMap<>();
    }

    public Shop(Map<Integer, Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public void addProduct(Goods goods) {
        goodsList.put(goods.getId(), goods);
    }

    public void removeProduct(Integer id) {
        goodsList.remove(id);
    }

    public void editProduct(Goods goods) {
        goodsList.put(goods.getId(), goods);
    }

    public Set<Goods> getGoodsList(SORT sort) {
        Set<Goods> set = null;
        switch (sort) {
            case ID: {
                set = new TreeSet<>((o1, o2) -> o2.getId() - o1.getId());
                set.addAll(this.goodsList.values());
            }
            break;
            case DATE: {
                Collection<Goods> go = this.goodsList.values();
                List<Goods> buffer = new ArrayList<>(this.goodsList.values());
                Collections.reverse(buffer);
                set = new HashSet<>(buffer);
            }
            break;
            case PRICE: {
                set = new TreeSet<>(Comparator.comparingInt(Goods::getPrice));
                set.addAll(this.goodsList.values());
            }
            break;
            default:
                break;
        }
        return set;
    }

    public static <T extends Goods> void show(Set<T> set) {
        set.forEach(el -> System.out.println(el.getId() + " " + el.getName() + " " + el.getPrice()));
    }
}

package lesson12.extended;

import lesson12.model.*;
import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Shop_list shop = new Shop_list();
        Scanner scanner;
        Integer key = 1;
        while (key != 0) {
            System.out.println("Выберите действие \n" +
                    "\t0. Выход.\n" +
                    "\t1. Вывод всех товаров.\n" +
                    "\t2. Добавление товара. \n" +
                    "\t3. Удаление товара. \n" +
                    "\t4. Редактирование товара.\n"
            );

            try {
                scanner = new Scanner(System.in);
                key = scanner.nextInt();
            } catch (InputMismatchException ex) {
                key = 5;
            }
            switch (key) {
                case 0: {
                    System.out.println("-> Выход. Приложение завершило работу.");
                }
                break;
                case 1: {
                    System.out.println("-> Вывод всех товаров.");
                    if (shop.getGoodsList().size() == 0) {
                        System.out.println("\t-> В магазине товаров нет.");
                    } else {
                        Shop_list.show(shop.getGoodsList());
                    }
                }
                break;
                case 2: {
                    System.out.println("-> Добавление товара.");
                    String finish = "";
                    while (!finish.equals("н")) {
                        System.out.println("\t Введите <id> <название> <цена> \n");
                        scanner = new Scanner(System.in);
                        String productInfo = scanner.nextLine();
                        String data[] = productInfo.split(" ");
                        try {
                            Integer id = Integer.valueOf(data[0]);
                            String name = data[1];
                            Integer price = Integer.valueOf(data[2]);
                            shop.addProduct(new Goods(id, name, price));
                            System.out.println("Товар успешно добавлен");
                        } catch (ShopAddProductException ex) {
                            System.out.println(ex.getMessage());
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            System.out.println("Введены не все данные о товаре");
                        } catch (NumberFormatException ex) {
                            System.out.println("Введены некорректные данные id или цена");
                        } catch (Exception ex) {
                            System.out.println("Введены некорректные данные");
                            ex.printStackTrace();
                        } finally {
                            System.out.println("Продолжить: любая клавиша, Выйти в главное меню : н");
                            finish = scanner.nextLine();
                        }

                    }
                }
                break;
                case 3: {
                    System.out.println("-> Удаление товара.");
                    String finish = "";
                    while (!finish.equals("н")) {
                        System.out.println("\t -> Введите id товара.\n");
                        scanner = new Scanner(System.in);
                        try {
                            Integer id = scanner.nextInt();
                            shop.removeProduct(id);
                        } catch (ShopRemoveProductException ex) {
                            System.out.println("Продукта с таким id не существует");
                        } catch (InputMismatchException ex) {
                            System.out.println("Введенно некорректное значение");
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        } finally {
                            System.out.println("Продолжить: любая клавиша, Выйти в главное меню : н");
                            scanner = new Scanner(System.in);
                            finish = scanner.nextLine();
                        }
                    }
                }
                break;
                case 4: {
                    System.out.println("-> Редактирование товара.");
                    String finish = "";
                    while (!finish.equals("н")) {
                        System.out.println("\t Введите <id> <название> <цена> \n");
                        scanner = new Scanner(System.in);
                        String productInfo = scanner.nextLine();
                        String data[] = productInfo.split(" ");
                        try {
                            Integer id = Integer.valueOf(data[0]);
                            String name = data[1];
                            Integer price = Integer.valueOf(data[2]);
                            Goods product = new Goods(id, name, price);
                            shop.editProduct(product);
                            System.out.println("Товар успешно обновлен");
                        } catch (ShopUpdateProductException ex) {
                            System.out.println(ex.getMessage());
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            System.out.println("Введены не все данные о товаре");
                        } catch (NumberFormatException ex) {
                            System.out.println("Введены некорректные данные id или цена");
                        } catch (Exception ex) {
                            System.out.println("Введены некорректные данные");
                            ex.printStackTrace();
                        } finally {
                            System.out.println("Продолжить: любая клавиша, Выйти в главное меню : н");
                            finish = scanner.nextLine();
                        }

                    }
                }
                break;
                default: {
                    System.out.println("-> Такой операции нет.");
                }
                break;
            }
        }
    }
}

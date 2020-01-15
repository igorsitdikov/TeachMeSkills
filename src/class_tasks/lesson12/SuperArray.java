package class_tasks.lesson12;

public class SuperArray<T extends Number> {
    private T[] array;
    private int current;
    public SuperArray() {
        array = (T[])new Number[10];
    }

    public SuperArray(int size) {
        array = (T[])new Number[size];
    }

    public int getSize() {
        return array.length;
    }

    public T[] getArray() {
        return array;
    }
    public T[] add(T element){
        if (current < array.length){
            array[current] = element;
            current++;
        } else {
            throw new SuperArrayOverflowException("Выход за пределы супер массива");
        }
        return array;
    }

    public Double getSum(){
        Double sum = 0.0;

        for (T item: array) {
            sum += item.doubleValue();
        }

        return sum;
    }
}

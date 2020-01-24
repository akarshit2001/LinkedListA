package adt;

public interface LinkedListADT<E> {
    public abstract void add(int index, E item);

    E remove(E item);

    int search(E item);

    void sort();

    void print();
}

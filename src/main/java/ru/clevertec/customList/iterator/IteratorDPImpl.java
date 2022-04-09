package ru.clevertec.customList.iterator;

public class IteratorDPImpl<E> implements IteratorDP<E>{

    private int currentIndex = -1;
    private int collectionSize;

    public IteratorDPImpl(int currentIndex, int collectionSize) {
        this.currentIndex = currentIndex;
        this.collectionSize = collectionSize;
    }

    @Override
    public boolean hasNext() {
        return currentIndex<collectionSize;
    }

    @Override
    public E next() {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void addBefore(E object) {
        if(currentIndex != -1) {

        }
    }

    @Override
    public void addAfter(E object) {
    }
}

package com.company;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class SortedList implements Collection<Integer>{
    private ArrayList<Integer> elements;

    private class SortedIterator implements Iterator<Integer> {

        private LinkedList<Integer> excludeIndex;

        public SortedIterator(){
            this.excludeIndex = new LinkedList<>();
        }

        @Override
        public boolean hasNext() {

            return excludeIndex.size() != elements.size();
        }

        @Override
        public Integer next() {
            int i = findeMinIndex();
            excludeIndex.add(i);

            return elements.get(i);
        }
        private int findeMinIndex(){
            int imin = 0;
            for (int i = 0; i< elements.size();i++){
                if(!excludeIndex.contains(i)){
                    imin = i;
                    break;
                }
            }
            for (int i = 0; i < elements.size(); i++){

                if (this.excludeIndex.contains(i)){// проверяем есть ли этот индех
                    continue;
                }
                if (elements.get(i) <= elements.get(imin)){
                    imin = i;
                }
            }
            return imin;
        }
    }

    public SortedList(){
        this.elements = new ArrayList<>();

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return new SortedIterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Integer o) {
        return this.elements.add(o);
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}

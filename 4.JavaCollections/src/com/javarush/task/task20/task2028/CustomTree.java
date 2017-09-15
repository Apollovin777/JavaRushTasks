package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Stream;

/* 
Построй дерево(1)
*/
public class CustomTree extends AbstractList<String> implements Serializable, Cloneable {
     @Override
    public boolean add(String name) {
        Queue<Entry> queue = new LinkedList<>();
        queue.add(root);
        Entry entryToAdd = new Entry(name);

        while (!queue.isEmpty()) {
            Entry<String> current = queue.poll();
            current.checkChildren();

            if (current.availableToAddLeftChildren) {
                current.leftChild = entryToAdd;
                current.leftChild.parent = current;
                return true;
            } else if (current.availableToAddRightChildren) {
                current.rightChild = entryToAdd;
                current.rightChild.parent = current;
                return true;
            } else {
                queue.add(current.leftChild);
                queue.add(current.rightChild);
            }

        }
        return false;
    }

    @Override
    public int size() {
        Queue<Entry> queue = new LinkedList<>();
        queue.add(this.root);
        Entry current;
        int size = 0;
        while (!queue.isEmpty()) {
            current = queue.poll();
            if (current.leftChild != null) {
                size++;
                queue.add(current.leftChild);
            }
            if (current.rightChild != null) {
                size++;
                queue.add(current.rightChild);
            }
        }
        return size;
    }

    Entry<String> root = new Entry<>("root");

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    //@Override
    //public String remove(int index) {
    //    throw new UnsupportedOperationException();
    //}

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object element) {
        Queue<Entry> queue = new LinkedList<>();
        queue.add(root);
        Entry current;
        while (!queue.isEmpty()) {
            current = queue.poll();
            if (current.elementName.equals(element)) {
                Entry parent = current.parent;
                if (parent.leftChild.elementName.equals(element)){
                    parent.leftChild = null;
                    current = null;
                    return true;
                }

                else if (parent.rightChild.elementName.equals(element)) {
                    parent.rightChild = null;
                    current = null;
                    return true;
                }
            }
            else{
                queue.add(current.leftChild);
                queue.add(current.rightChild);
            }

        }
        return false;
    }

    public String getParent(String element){
        Queue<Entry> queue = new LinkedList<>();
        queue.add(root);
        Entry current;
        while (!queue.isEmpty()) {
            current = queue.poll();
            if (current.elementName.equals(element)) {
                Entry parent = current.parent;
                return parent.elementName;
            }
            else{
                if (current.leftChild != null)
                    queue.add(current.leftChild);
                if (current.rightChild != null)
                    queue.add(current.rightChild);
            }
        }
        return "null";
    }




    public static void main(String[] args) {
        List<String> list = new CustomTree();
        for (int i = 1; i < 16; i++) {
            list.add(String.valueOf(i));
        }

        System.out.println("Expected 3, actual is " + ((CustomTree) list).getParent("8"));
        list.remove("5");

        System.out.println("Expected null, actual is " + ((CustomTree) list).getParent("11"));
    }

    static class Entry<T> implements Serializable{
        String elementName;
        int lineNumber;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            this.availableToAddLeftChildren = true;
            this.availableToAddRightChildren = true;
        }

        void checkChildren(){
            if (this.leftChild != null)
                this.availableToAddLeftChildren = false;
            if (this.rightChild != null)
                this.availableToAddRightChildren = false;
        }

        boolean isAvailableToAddChildren(){
            return this.availableToAddLeftChildren || this.availableToAddRightChildren;
        }

    }
}

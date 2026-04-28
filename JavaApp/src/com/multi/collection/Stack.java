package com.multi.collection;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<T> {

    private List<T> elements = new ArrayList<>();

    public void push(T element) {
        elements.add(element);
    }

    public T pop() {
        if(elements.isEmpty()) {
           throw new EmptyStackException();
        }
        return elements.remove(elements.size() - 1);
    }

}

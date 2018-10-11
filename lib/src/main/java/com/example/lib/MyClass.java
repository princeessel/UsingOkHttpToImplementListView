package com.example.lib;

import java.util.ArrayList;

public class MyClass {

    public MyClass() {



    }



    public ArrayList<String> createList(int elementCount) {

        ArrayList<String> elements = new ArrayList<>(elementCount);

        for(int i=0; i<elementCount; i++) {

            elements.add("Element " + i);

        }

        return elements;

    }

}


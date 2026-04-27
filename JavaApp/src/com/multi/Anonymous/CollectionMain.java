package com.multi.Anonymous;

public class CollectionMain {
    private int x;
    private CollectionEx collectionEx = new CollectionEx() {
        @Override
        public void add() {

        }

        @Override
        public void remove() {

        }

        @Override
        public void empty() {

        }
    };

    public CollectionMain() {
        new CollectionEx() {
            //inner -> implements 생략 => Anonymous
            @Override
            public void add() {
                x++;
            }

            @Override
            public void remove() {

            }

            @Override
            public void empty() {

            }
        }.add();
    }

    public static void main(String[] args) {
        CollectionMain collectionMain =new CollectionMain();
    }

}

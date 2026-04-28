package ch13.sec02.exam01;

public class Product<T, S> {
    public T kind;
    public S model;

    public T getKind() {
        return kind;
    }

    public S getModel() {
        return model;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }

    public void setModel(S model) {
        this.model = model;
    }
}

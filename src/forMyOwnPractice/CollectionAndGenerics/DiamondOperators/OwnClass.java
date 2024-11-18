package forMyOwnPractice.CollectionAndGenerics.DiamondOperators;

public class OwnClass<T> {
    T value;
    public OwnClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

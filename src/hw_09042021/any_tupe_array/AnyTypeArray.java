package hw_09042021.any_tupe_array;

public class AnyTypeArray<T> {
    private Object[] array;

    public AnyTypeArray(T i0, T i1, T i2) {
        this.array = new Object[]{i0, i1, i2};
    }

    public T getElementArray(int indexArray) {
        return (T) array[indexArray];
    }



}


package hw_09042021.any_tupe_array;

public class AnyTypeArray<T> {
    private T [] array;

    public AnyTypeArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public T getElementIndex(int index){
        return array[index];
    }



}


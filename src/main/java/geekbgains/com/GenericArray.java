package geekbgains.com;

import java.util.ArrayList;

public class GenericArray<T> {
    private T[] arr;
    private String resultString = "";

    public GenericArray(T[] arr) {
        this.arr = arr;
    }

    public boolean elementsExchange(int firstInd, int secondInd) {
        if (firstInd >= arr.length || secondInd >= arr.length) {
            resultString = "Превышение границы массива.";
            return false;
        }
        T objectBuffer = arr[firstInd];
        arr[firstInd] = arr[secondInd];
        arr[secondInd] = objectBuffer;
        return true;
    }

    public String getResultString() {
        return resultString;
    }

    public void printArray() {
        for (T arrElement: arr) {
            System.out.print(arrElement.toString() + " ");
        }
        System.out.println();
    }

    public ArrayList<T> convertToArrayList() {
        ArrayList<T> result = new ArrayList<>();
        for (T arrElement: arr) {
            result.add(arrElement);
        }
        return result;
    }

}

import java.util.Arrays;

public <T> T[] arrayMapping(T[] array, Function<T> function){
    T[] arr = array.clone();
    for (int i=0; i<array.length; i++){
        arr[i] = function.apply(array[i]);
    }
    return arr;
}


void main() {
    String[] abc = new String[3];
    abc[0] = "Hello";
    abc[1] = "World";
    abc[2] = "!!!!!";

    Integer[] abc1 = new Integer[3];
    abc1[0] = -1;
    abc1[1] = 2;
    abc1[2] = -3;

    System.out.println(Arrays.toString(arrayMapping(abc1, new AbsFunction())));

    System.out.println(Arrays.toString(arrayMapping(abc, str -> str.toUpperCase())));
}

class AbsFunction implements Function<Integer>{
    @Override
    public Integer apply(Integer o){
        return Math.abs(o);
    }
}


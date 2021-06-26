package advance;

public class GenericMethodTest {

    public static <E> void printArray(E[] intputArray){
        for(E element: intputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 创建不同类型数组: Integer, Double和Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array integerArray contains:");
        printArray(intArray);

        System.out.println("Array doubleArray contains:");
        printArray(doubleArray);

        System.out.println("Array characterArray contains:");
        printArray(charArray);
    }
}









































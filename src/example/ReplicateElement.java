package example;

public class ReplicateElement {
    public static void main(String[] args) {
        //查找数组中重复的元素·
        int[] myArray = {1, 2, 5, 5, 6, 6, 7, 2, 9, 2};
        findDuplicateInArray(myArray);
    }

    public static void findDuplicateInArray(int[] a){
        int count = 0;
        for(int j = 0; j < a.length; j ++){
            for(int k = j + 1; k < a.length; k++){
                if(a[j] == a[k]){
                    count ++;
                }
            }
            if(count == 1)
                System.out.println("重复元素: " + a[j]);
            count = 0;
        }
    }
}


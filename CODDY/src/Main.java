// Вам даны два отсортированных списка (по возрастанию) длина которых a и b.
//Задача: создать функцию, которая будет на выходе иметь один общий
// отсортированный список res (по убыванию).
// Пользоваться sort или иными функциями для сортировки ЗАПРЕЩЕНО!

//Сложность данного алгоритма слияния
// отсортированных списков будет O(n), где n - общая длина исходных списков.
public class Main {


    public static void main(String[] args) {
        int[] list1 = {1, 3, 5, 7, 9};
        int[] list2 = {2, 4, 6, 8, 10};

        int[] result = MergeSortedLists.mergeSortedLists(list1, list2);

        printer(result);



    }
    public static void printer(int[] result){
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }


}
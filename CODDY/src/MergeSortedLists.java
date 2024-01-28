public class MergeSortedLists {
    public static int[] mergeSortedLists(int[] list1, int[] list2) {
        int[] result = new int[list1.length + list2.length];

        int i = list1.length - 1;
        int j = list2.length - 1;
        int k = result.length - 1;

        while (i >= 0 && j >= 0) {
            if (list1[i] >= list2[j]) {
                result[k] = list1[i];
                i--;
            } else {
                result[k] = list2[j];
                j--;
            }
            k--;
        }

        while (i >= 0) {
            result[k] = list1[i];
            i--;
            k--;
        }

        while (j >= 0) {
            result[k] = list2[j];
            j--;
            k--;
        }

        return result;
    }
}
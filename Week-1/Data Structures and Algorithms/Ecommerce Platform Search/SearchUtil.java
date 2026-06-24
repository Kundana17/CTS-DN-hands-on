public class SearchUtil {

    public static Product linearSearch(Product arr[], String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].name.equalsIgnoreCase(item)) {
                return arr[i];
            }
        }
        return null;
    }

    public static Product binarySearch(Product arr[], String item) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int res = arr[mid].name.compareToIgnoreCase(item);
            if (res == 0)
                return arr[mid];
            if (res < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }
}
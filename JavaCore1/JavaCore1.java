import java.util.*;
import java.time.LocalDate;

public class JavaCore1 {
    public static void main(String[] args) {
        JavaCore1 obj1 = new JavaCore1();
        int[] arr = {1, 2, 3, 2, 4, 4, 1, 5, 6, 1};
        System.out.println(obj1.secondBigNumber(arr));
        System.out.println("Yig'indi: " + obj1.SumOfArray(arr));
        System.out.println(obj1.ArraySort(arr));
        int[] duplicates = obj1.FindDublicate(arr);
        System.out.println(Arrays.toString(duplicates));
        System.out.println(obj1.MaxMinNumber(arr));
        System.out.println(obj1.RightRectangleArea(5,5.5));
        System.out.println(obj1.AgeCalculator(2003,03,10));
    }

    public String secondBigNumber(int[] arr) {
        int firstBigNumber = 0;
        int secondBigNumber = 0;

        if (arr.length==0 || arr.length==1) {
            return "Ikkinchi eng katta element topilmadi";
        }

        for (int i = 0; i < arr.length; i++) {
            if (firstBigNumber<arr[i]) {
                secondBigNumber = firstBigNumber;
                firstBigNumber = arr[i];
            }
            else if (arr[i] > secondBigNumber && arr[i] != firstBigNumber) {
                secondBigNumber = arr[i];
            }
        }

        return "Ikkinchi eng katta element: " + secondBigNumber;
    }

    public int SumOfArray(int[] arr) {
        int sum = 0;
        if (arr.length == 0) {
            return sum;
        }
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        return sum;
    }

    public boolean ArraySort(int[] arr) {
        if (arr.length <= 1) {
            return true;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public int[] FindDublicate(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        Set<Integer> duplicatesSet = new HashSet<>();

        for (int n : arr) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() >= 2) {
                duplicatesSet.add(entry.getKey());
            }
        }

        int[] result = new int[duplicatesSet.size()];
        int i = 0;
        for (int n : duplicatesSet) {
            result[i++] = n;
        }

        return result;
    }

    public String MaxMinNumber(int[] arr) {
        if (arr.length<1) {
            throw new IllegalArgumentException("Array not be null");
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<min) {
                min=arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }

        return "Minimal: " + min + ", Maksimal: " + max;
    }

    public String RightRectangleArea(double a, double b) {
        if (a<=0 || b<=0) {
            throw new IllegalArgumentException("Length must not be less than zero");
        }
        double area = a*b;
        if (area == (int) area) {
            return "Maydon: " + (int) area;
        }
        else {
            String formattedArea = String.format("%.2f", area);
            return "Maydon: " +  formattedArea;
        }
    }

    public String AgeCalculator(int year, int month, int day){
        LocalDate today = LocalDate.of(2026,1,25);
        int CurrentYear = today.getYear();
        int CurrentMonth = today.getMonthValue();
        int CurrentDay = today.getDayOfMonth();
        int ageYear=0;
        int ageMonth=0;
        int ageDay=0;

        if(year<=CurrentYear && month<13 && day<32) {
            ageYear=CurrentYear-year;
            if (CurrentMonth<month) {
                ageMonth = (CurrentMonth+12)-month;
            }
            else {
                ageMonth = CurrentMonth-month;
            }
            if (CurrentDay<day) {
                ageDay = (CurrentDay+30)-day;
            }
            else {
                ageDay = CurrentDay-day;
            }

            ageYear = CurrentYear - year;

            if (CurrentMonth < month ||
                    (CurrentMonth == month && CurrentDay < day)) {
                ageYear--;
            }
        }
        else {
            throw new IllegalArgumentException("Xatolik: Tug‘ilgan sana kelajakda bo‘lishi mumkin emas!");

        }
        return "Yosh: " + ageYear + " yil " + ageMonth + " oy " + ageDay + " kun";
    }
}

package ScenerioBased ;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDataProcessing {
    public static void main(String[] args) {
        int[] ages = {25, 30, 22, 45, 28};

        ArrayList<Integer> ageList = new ArrayList<>();
        for (int age : ages) {
            ageList.add(Integer.valueOf(age)); // Wrapper class conversion
        }
        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);
        System.out.println("Employee Ages " + ageList);
        System.out.println("Youngest Age " + youngest);
        System.out.println("Oldest Age " + oldest);
    }
}
package chapter01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int num = scanner.nextInt();
            nums.add(num);
        }

        nums.sort(Integer::compareTo);

        System.out.println(nums);
    }
}

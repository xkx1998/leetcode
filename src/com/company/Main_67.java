package com.company;

public class Main_67 {
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int pointA = a.length() - 1;
        int pointB = b.length() - 1;

        int curry = 0;
        while (pointA >= 0 || pointB >= 0) {
            int sum = curry;
            if (pointA >= 0) {
                sum += a.charAt(pointA)-'0';
                pointA--;
            }
            if (pointB >= 0) {
                sum += b.charAt(pointB)-'0';
                pointB--;
            }
            sb.append(sum % 2);
            curry = sum / 2;
        }

        if (curry != 0) {
            sb.append("1");
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("0", "0"));
    }
}

package com.codegym.task.task18.task1820;

/* 
Rounding numbers

*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);

        String file1 = sc.nextLine();
        String file2 = sc.nextLine();

        sc.close();

        FileInputStream f1 = new FileInputStream(file1);
        FileOutputStream f2 = new FileOutputStream(file2);

        byte[] buff = new byte[f1.available()];
        f1.read(buff);

        String s = new String(buff);
        String[] sar = s.split(" ");
        String out = "";

        for (String i : sar) {
            int b = Math.round(Float.parseFloat(i));
            out = out + b + " ";
        }
        System.out.println(out);
        out = out.substring(0, out.length()-1);

        f2.write(out.getBytes(StandardCharsets.UTF_8));

        f1.close();
        f2.close();
    }
}

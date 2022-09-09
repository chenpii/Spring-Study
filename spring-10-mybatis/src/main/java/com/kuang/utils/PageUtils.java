package com.kuang.utils;

import org.junit.Test;

public class PageUtils {
    public int getTotalPages(int totalDevices, int pageSize) {
        int totalPages = 1;
        if (totalDevices % pageSize == 0) {
            totalPages = totalDevices / pageSize;
        } else {
            totalPages = (totalDevices / pageSize) + 1;
        }

        return totalPages;
    }

    @Test
    public void test() {
        int totalPages = getTotalPages(21, 20);
        System.out.println(totalPages);
        String num = "10";
        int num2= Integer.parseInt(num);
    }
}

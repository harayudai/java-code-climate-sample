package com.codecy.sample.utility;

import java.util.*;
import java.time.*;

public class Test {

    // AvoidUsingHardCodedIP:OFF
    private String ip = "127.0.0.1";

    public void test(String name) {
        String unUsed = "aaa";
        try {
            // AvoidReassigningParameters:ON
            name = name.trim();
            System.out.println("Hello " + name);
        } catch (Exception e) {
            // AvoidPrintStackTrace:OFF
            e.printStackTrace();
        }
    }
}
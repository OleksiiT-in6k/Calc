package com.interlink;

/**
 * Created by employee on 7/8/16.
 */
public class calcFunctions {

    public static int sum(String input) {
        int result=0;
        if (input.equals(""))return 0;
        if(input.contains(",")||input.contains("/n")) {
            result=0;
            for(String s1:input.split("\n"))
            for (String s2 : s1.split(","))
                result+=Integer.parseInt(s2);
        }
        else
        result=Integer.parseInt(input);
    return result;
    }
}

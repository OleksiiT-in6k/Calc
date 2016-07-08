package com.interlink;

/**
 * Created by employee on 7/8/16.
 */
public class calcFunctions {

    public static int sum(String input) {
        int result=0;
        if (input.equals(""))return 0;
        if(input.contains(",")) {
            result=0;
            for (String s : input.split(","))
                result+=Integer.parseInt(s);
        }
        else
        result=Integer.parseInt(input);
    return result;
    }
}

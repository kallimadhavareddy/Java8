package com.osp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestClass {
    public static void main(String args[]){
        Pattern p = Pattern.compile("\"([^\"]*)\"");
        Matcher m = p.matcher("2019-09-09 16:52:03.827  WARN 22280 --- [nio-8084-exec-8] .m.m.a.ExceptionHandlerExceptionResolver : Resolved [org.springframework.http.converter.HttpMessageNotReadableException: JSON parse error: Cannot deserialize value of type `int` from String \"fre\": not a valid Integer value; nested exception is com.fasterxml.jackson.databind.exc.InvalidFormatException: Cannot deserialize value of type `int` from String \"fre\": not a valid Integer value at [Source: (PushbackInputStream); line: 3, column: 15] (through reference chain: com.ing.api.bankswitch.former.presentation.data.SwitchCase[\"status\"])]");
        while (m.find()) {
            System.out.println(m.group(1));
        }
    }
}

package com.osp.enump;

public class EnumExample {
    public static void main(String args[]){
        System.out.println(BspError.valueOfErrorField("JSON parse error , invalid field ERROR1"));
        System.out.println(BspError.valueOfFrontEndErrorMessage("ERROR1"));
        System.out.println(BspError.valueOfErrorCode("ERROR1"));
    }
}

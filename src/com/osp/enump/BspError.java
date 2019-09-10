package com.osp.enump;

import java.util.HashMap;
import java.util.Map;

public enum BspError {
    JSF_ERROR_01("JSON parse error , invalid field ERROR1","ERROR1","invalid_ERROR1"),
    JSF_ERROR_02("JSON parse error , invalid field ERROR2","ERROR2","invalid_ERROR2"),
    JSF_ERROR_03("JSON parse error , invalid field ERROR3","ERROR3","invalid_ERROR3"),
    JSF_ERROR_04("JSON parse error , invalid field ERROR4","ERROR4","invalid_ERROR4"),
    JSF_ERROR_05("JSON parse error , invalid field ERROR5","ERROR5","invalid_ERROR5"),
    JSF_ERROR_06("JSON parse error , invalid field ERROR6","ERROR6","invalid_ERROR6"),
    JSF_ERROR_07("JSON parse error , invalid field ERROR7","ERROR7","invalid_ERROR7"),
    JSF_ERROR_08("JSON parse error , invalid field ERROR8","ERROR8","invalid_ERROR8"),
    JSF_ERROR_09("JSON parse error , invalid field ERROR9","ERROR9","invalid_ERROR9"),
    JSF_ERROR_10("JSON parse error , invalid field ERROR10","ERROR10","invalid_ERROR10");

    private static final Map<String, String> BY_ERROR = new HashMap<>();
    private static final Map<String, String> BY_ERROR_FIELD = new HashMap<>();
    private static final Map<String, String> BY_FE_ERROR_CODE = new HashMap<>();
    private static final Map<String, String> BY_ERROR_FIELD_WITH_ERROR = new HashMap<>();


    static {
        for (BspError e : values()) {
            BY_ERROR.put(e.error, e.errorField);
            BY_FE_ERROR_CODE.put(e.error, e.frontEndErrorCode);
            BY_ERROR_FIELD.put(e.errorField, e.frontEndErrorCode);
            BY_ERROR_FIELD_WITH_ERROR.put(e.errorField, e.error);
        }
    }

    public final String error;
    public final String errorField;
    public final String frontEndErrorCode;

    BspError(String error, String errorField, String frontEndErrorCode) {
        this.error = error;
        this.errorField = errorField;
        this.frontEndErrorCode = frontEndErrorCode;
    }

    public static String valueOfErrorField(String label) {
        return BY_ERROR.get(label);
    }
    public static String valueOfErrorCode(String errorField) {
        return BY_ERROR_FIELD.get(errorField);
    }
    public static String valueOfFrontEndErrorMessage(String errorField) {
        return BY_ERROR_FIELD_WITH_ERROR.get(errorField);
    }
}

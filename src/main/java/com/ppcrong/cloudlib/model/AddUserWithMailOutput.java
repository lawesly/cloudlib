package com.ppcrong.cloudlib.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Output JSON for AddUserWithMail
 */

public class AddUserWithMailOutput extends JsonBaseObject {
    @JsonProperty("AccountID")
    int AccountID;
    @JsonProperty("ReturnCode")
    String ReturnCode;
    @JsonProperty("ReturnMessage")
    String ReturnMessage;

    public AddUserWithMailOutput() {
    }

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int accountID) {
        AccountID = accountID;
    }

    public String getReturnCode() {
        return ReturnCode;
    }

    public void setReturnCode(String returnCode) {
        ReturnCode = returnCode;
    }

    public String getReturnMessage() {
        return ReturnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        ReturnMessage = returnMessage;
    }
}

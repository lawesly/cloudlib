package com.ppcrong.cloudlib.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Output JSON for GetUserSetting
 */

public class GetUserSettingOutput extends JsonBaseObject {
    @JsonProperty("UserNO")
    Integer UserNO;
    @JsonProperty("AccountID")
    Integer AccountID;
    @JsonProperty("UserName")
    String UserName;
    @JsonProperty("UserGender")
    String UserGender;
    @JsonProperty("UserHeight")
    Integer UserHeight;
    @JsonProperty("UserWeight")
    Integer UserWeight;
    @JsonProperty("BirthdayYear")
    String BirthdayYear;
    @JsonProperty("BirthdayMonth")
    String BirthdayMonth;
    @JsonProperty("BirthdayDay")
    String BirthdayDay;
    @JsonProperty("PhoneNumber")
    String PhoneNumber;
    @JsonProperty("FB")
    String FB;
    @JsonProperty("Twitter")
    String Twitter;
    @JsonProperty("WeChat")
    String WeChat;
    @JsonProperty("YouTube")
    String YouTube;
    @JsonProperty("StrideLength")
    Integer StrideLength;
    @JsonProperty("StepGoal")
    Integer StepGoal;
    @JsonProperty("SleepBedHour")
    String SleepBedHour;
    @JsonProperty("SleepBedMinute")
    String SleepBedMinute;
    @JsonProperty("SleepWakeHour")
    String SleepWakeHour;
    @JsonProperty("SleepWakeMinute")
    String SleepWakeMinute;
    @JsonProperty("ReturnCode")
    String ReturnCode;
    @JsonProperty("ReturnMessage")
    String ReturnMessage;

    public GetUserSettingOutput() {
    }

    public Integer getUserNO() {
        return UserNO;
    }

    public void setUserNO(Integer userNO) {
        UserNO = userNO;
    }

    public Integer getAccountID() {
        return AccountID;
    }

    public void setAccountID(Integer accountID) {
        AccountID = accountID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserGender() {
        return UserGender;
    }

    public void setUserGender(String userGender) {
        UserGender = userGender;
    }

    public Integer getUserHeight() {
        return UserHeight;
    }

    public void setUserHeight(Integer userHeight) {
        UserHeight = userHeight;
    }

    public Integer getUserWeight() {
        return UserWeight;
    }

    public void setUserWeight(Integer userWeight) {
        UserWeight = userWeight;
    }

    public String getBirthdayYear() {
        return BirthdayYear;
    }

    public void setBirthdayYear(String birthdayYear) {
        BirthdayYear = birthdayYear;
    }

    public String getBirthdayMonth() {
        return BirthdayMonth;
    }

    public void setBirthdayMonth(String birthdayMonth) {
        BirthdayMonth = birthdayMonth;
    }

    public String getBirthdayDay() {
        return BirthdayDay;
    }

    public void setBirthdayDay(String birthdayDay) {
        BirthdayDay = birthdayDay;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getFB() {
        return FB;
    }

    public void setFB(String FB) {
        this.FB = FB;
    }

    public String getTwitter() {
        return Twitter;
    }

    public void setTwitter(String twitter) {
        Twitter = twitter;
    }

    public String getWeChat() {
        return WeChat;
    }

    public void setWeChat(String weChat) {
        WeChat = weChat;
    }

    public String getYouTube() {
        return YouTube;
    }

    public void setYouTube(String youTube) {
        YouTube = youTube;
    }

    public Integer getStrideLength() {
        return StrideLength;
    }

    public void setStrideLength(Integer strideLength) {
        StrideLength = strideLength;
    }

    public Integer getStepGoal() {
        return StepGoal;
    }

    public void setStepGoal(Integer stepGoal) {
        StepGoal = stepGoal;
    }

    public String getSleepBedHour() {
        return SleepBedHour;
    }

    public void setSleepBedHour(String sleepBedHour) {
        SleepBedHour = sleepBedHour;
    }

    public String getSleepBedMinute() {
        return SleepBedMinute;
    }

    public void setSleepBedMinute(String sleepBedMinute) {
        SleepBedMinute = sleepBedMinute;
    }

    public String getSleepWakeHour() {
        return SleepWakeHour;
    }

    public void setSleepWakeHour(String sleepWakeHour) {
        SleepWakeHour = sleepWakeHour;
    }

    public String getSleepWakeMinute() {
        return SleepWakeMinute;
    }

    public void setSleepWakeMinute(String sleepWakeMinute) {
        SleepWakeMinute = sleepWakeMinute;
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

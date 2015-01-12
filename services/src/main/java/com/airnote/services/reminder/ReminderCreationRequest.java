package com.airnote.services.reminder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Date;

public class ReminderCreationRequest {

    @JsonProperty("userId") String userId;
    @JsonProperty("emailId") String emailId;
    @JsonProperty("eventAt") @JsonDeserialize(using = CustomDateSerializer.class) Date eventAt;
    @JsonProperty("content") String content;
    @JsonProperty("emailSent") boolean emailSent = false;

    public String getUserId() {
        return userId;
    }

    public String getEmailId(){
        return emailId;
    }

    public Date getEventAt() {
        return eventAt;
    }

    public String getContent() {
        return content;
    }

    public boolean isEmailSent() {
        return emailSent;
    }
}

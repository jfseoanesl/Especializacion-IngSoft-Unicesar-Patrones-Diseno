package org.example.good;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SmartWatch implements IWatch, ISmartWatch {
    @Override
    public String getTime() {

        return LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss"));
    }

    @Override
    public String getDateTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy hh:mm:ss"));
    }

    @Override
    public String getAlarm() {
        return "This alarm is 04:00 am";
    }

    @Override
    public String getEmailNotifications() {
        return "Your are 2 email received";
    }

    @Override
    public String getWhatsAppNotifications() {
        return "you are 5 new messages";
    }
}

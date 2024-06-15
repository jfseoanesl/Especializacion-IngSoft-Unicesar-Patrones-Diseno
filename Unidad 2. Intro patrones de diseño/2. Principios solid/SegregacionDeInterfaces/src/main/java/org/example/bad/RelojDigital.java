package org.example.bad;

public class RelojDigital implements IWatch{
    @Override
    public String getTime() {
        return "";
    }

    @Override
    public String getDateTime() {
        return "";
    }

    @Override
    public String getAlarm() {
        return "";
    }

    @Override
    public String getEmailNotifications() {
        throw new RuntimeException("tarea no soportada");
    }

    @Override
    public String getWhatsAppNotifications() {
        throw new RuntimeException("tarea no soportada");
    }
}

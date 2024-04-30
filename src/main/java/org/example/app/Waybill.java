package org.example.app;

import java.util.Date;

public class Waybill {
    private int waybillId;
    private Date date;

    // геттеры
    public int getWaybillId() {
        return waybillId;
    }

    public Date getDate() {
        return date;
    }

    // сеттеры
    public void setWaybillId(int waybillId) {
        this.waybillId = waybillId;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

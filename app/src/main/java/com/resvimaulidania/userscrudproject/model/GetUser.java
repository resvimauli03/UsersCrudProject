package com.resvimaulidania.userscrudproject.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUser {
    @SerializedName("data")
    List<user> data;
    @SerializedName("total")
    String total;

    public String getTotal(){
        return total;
    }

    public List<user> getData() {
        return data;
    }
    public void setData(List<user> data) {
        this.data = data;
    }
    public void setTotal(String total) {
        this.total = total;
    }
}
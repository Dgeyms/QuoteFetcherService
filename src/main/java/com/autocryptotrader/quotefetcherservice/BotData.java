package com.autocryptotrader.quotefetcherservice;

import org.springframework.stereotype.Component;


@Component
public class BotData {

    private Long id;
    private String pairToken;
    private String time;

    public String getPairToken() {
        return pairToken;
    }

    public void setPairToken(String pairToken) {
        this.pairToken = pairToken;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

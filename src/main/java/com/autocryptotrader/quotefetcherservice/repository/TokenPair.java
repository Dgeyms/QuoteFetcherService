package com.autocryptotrader.quotefetcherservice.repository;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "name_token_pair")
public class TokenPair{
    @Id
    private String id;
    private String nameTokenPair;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameTokenPair() {
        return nameTokenPair;
    }

    public boolean setNameTokenPair(String nameTokenPair) {
        this.nameTokenPair = nameTokenPair;
        return false;
    }
}

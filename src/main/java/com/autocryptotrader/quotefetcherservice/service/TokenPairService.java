package com.autocryptotrader.quotefetcherservice.service;

import org.springframework.stereotype.Service;

@Service
public interface TokenPairService {
    boolean checkTokenPairInDatabase(String nameTokenPair);
    void saveTokenPairInDatabase(String nameTokenPair);
}

package com.autocryptotrader.quotefetcherservice.service;

import com.autocryptotrader.quotefetcherservice.repository.TokenPairRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TokenPairServiceImpl implements TokenPairService{
private TokenPairRepository tokenPairRepository;

    public TokenPairServiceImpl(TokenPairRepository tokenPairRepository) {
        this.tokenPairRepository = tokenPairRepository;
    }

    @Autowired


    @Override
    public boolean checkTokenPairInDatabase(String nameTokenPair) {
        return tokenPairRepository.existsByNameTokenPair(nameTokenPair);
    }

    @Override
    public void saveTokenPairInDatabase(String nameTokenPair) {

    }

}

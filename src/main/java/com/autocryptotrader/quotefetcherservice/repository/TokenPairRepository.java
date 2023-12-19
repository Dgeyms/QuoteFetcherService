package com.autocryptotrader.quotefetcherservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TokenPairRepository extends MongoRepository<TokenPair, String> {

    public boolean existsByNameTokenPair(String nameTokenPair);
}

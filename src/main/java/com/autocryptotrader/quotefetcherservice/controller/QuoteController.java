package com.autocryptotrader.quotefetcherservice.controller;

import com.autocryptotrader.quotefetcherservice.service.TokenPairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/quoteFetcherService")
public class QuoteController {
    private final TokenPairService tokenPairService;
@Autowired
    public QuoteController(TokenPairService tokenPairService) {
        this.tokenPairService = tokenPairService;
    }

    @GetMapping("/getTokenPair")
    public void getTokenPair(@RequestParam String nameTokenPair){
        boolean existsTokenPairInDatabase = existsTokenPairInDatabase(nameTokenPair);
        if(!existsTokenPairInDatabase){
            saveTokenPairInDatabase(nameTokenPair);
        }
    }

    private boolean existsTokenPairInDatabase(String nameTokenPair) {
        return tokenPairService.checkTokenPairInDatabase(nameTokenPair);
    }
    private void saveTokenPairInDatabase(String nameTokenPair) {
        tokenPairService.saveTokenPairInDatabase(nameTokenPair);
    }
}


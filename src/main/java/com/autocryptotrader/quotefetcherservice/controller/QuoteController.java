package com.autocryptotrader.quotefetcherservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quoteFetcherService")
public class QuoteController {
    @GetMapping("/getTokenPair")
    public void getTokenPair(@RequestParam String nameTokenPair){

    }

}

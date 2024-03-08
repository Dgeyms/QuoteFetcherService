package com.autocryptotrader.quotefetcherservice.service;

import org.springframework.stereotype.Service;

@Service
public interface BotService {

    boolean checkBotInRepository(Long idBot);
}

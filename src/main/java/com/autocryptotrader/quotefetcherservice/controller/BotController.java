package com.autocryptotrader.quotefetcherservice.controller;

import com.autocryptotrader.quotefetcherservice.BotData;
import com.autocryptotrader.quotefetcherservice.service.BotService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/quoteFetcherService")
public class BotController {

    private final BotData botData;
    private BotService botService;

    public BotController(BotData botData, BotService botService) {
        this.botData = botData;
        this.botService = botService;
    }

    @PostMapping("/postBotData")
    public void checkBotInDatabaseById(@RequestParam BotData botData) {
        // проверить если такой Bot в базе данных
        if (true == checkIdBootInDatabase(botData.getId())) {
            System.out.println("Bot: " + botData.getId() + " OK in database");
        } else {

        }
    }

    private boolean checkIdBootInDatabase(Long idBot) {
        return botService.checkBotInRepository(idBot);
    }
}

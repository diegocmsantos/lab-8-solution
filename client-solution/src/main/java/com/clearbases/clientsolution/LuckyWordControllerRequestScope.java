package com.clearbases.clientsolution;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestScope
public class LuckyWordControllerRequestScope {

    //  Notice how the prefix of "wordConfig"
    //  must be repeated without @ConfigurationProperties:
    @Value("${wordConfig.luckyWord}") String luckyWord;
    @Value("${wordConfig.preamble}") String preamble;

    @GetMapping("/lucky-word2")
    public String showLuckyWord() {
        return preamble + ": " + luckyWord;
    }

    public String getLuckyWord() {
        return luckyWord;
    }

    public void setLuckyWord(String luckyWord) {
        this.luckyWord = luckyWord;
    }

    public String getPreamble() {
        return preamble;
    }

    public void setPreamble(String preamble) {
        this.preamble = preamble;
    }

}

package com.mmeln.springboot.jokeapp.services.impl;

import com.mmeln.springboot.jokeapp.services.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceJavaBaseConfigImpl implements JokeService {

    private final ChuckNorrisQuotes quotesJavaBase;

    @Autowired
    public JokeServiceJavaBaseConfigImpl(@Qualifier("quotesJavaBase") ChuckNorrisQuotes quotesJavaBase) {
        this.quotesJavaBase = quotesJavaBase;
    }

    @Override
    public String getJoke() {
        return quotesJavaBase.getRandomQuote();
    }
}

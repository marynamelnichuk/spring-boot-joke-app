package com.mmeln.springboot.jokeapp.services.impl;

import com.mmeln.springboot.jokeapp.services.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceWithXmlConfigImpl implements JokeService {

    private final ChuckNorrisQuotes quotesXml;

    @Autowired
    public JokeServiceWithXmlConfigImpl(@Qualifier("quotesXml") ChuckNorrisQuotes quotesXml) {
        this.quotesXml = quotesXml;
    }

    @Override
    public String getJoke() {
        return quotesXml.getRandomQuote();
    }
}

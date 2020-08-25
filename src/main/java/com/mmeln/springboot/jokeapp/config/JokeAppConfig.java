package com.mmeln.springboot.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JokeAppConfig {

    @Bean
    public ChuckNorrisQuotes quotesJavaBase()
    {
        return new ChuckNorrisQuotes();
    }

}

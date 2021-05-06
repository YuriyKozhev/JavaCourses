package com.yuriy;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;

public class QuoteAggregator {
    private List<String> sites;

    public QuoteAggregator(List<String> sites) {
        this.sites = sites;
    }

    public CompletableFuture<Quote> getQuoteAsync(String site) {
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return CompletableFuture
                .supplyAsync(() -> {
                    var price = ThreadLocalRandom.current().nextInt(100, 120);
                    return new Quote(site, price);
                });
    }

    public void getAllQuotesAsync() {
        for (var site :
                sites) {
            getQuoteAsync(site)
                    .thenAccept(System.out::println);
        }
    }
}




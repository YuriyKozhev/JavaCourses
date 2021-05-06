package com.yuriy;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class QuoteAggregator {
    private final List<String> sites;

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

    public Quote getQuote(String site) {
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        var price = ThreadLocalRandom.current().nextInt(100, 120);

        return new Quote(site, price);
    }


    public void getAllQuotesAsync() {
        var arr = sites.stream()
                .map(site -> {
                    System.out.println("Getting a quote from " + site);
                    return CompletableFuture
                            .supplyAsync(() -> getQuote(site))
                            .thenAcceptAsync(System.out::println);
                })
                .toArray(CompletableFuture<?>[]::new);

        var all = CompletableFuture.allOf(arr);

        long startTime = System.currentTimeMillis();

        all.thenRun(() -> {
            System.out.println("All tasks are completed.");
            System.out.printf("Retrieved all quotes in  %d msec%n", System.currentTimeMillis() - startTime);
        }).join();

    }
}




package com.yuriy;

import java.util.List;

public class ProjectDemo {
    public static void show() {
        QuoteAggregator quoteAggregator = new QuoteAggregator(List.of("site1", "site2", "site3"));
        quoteAggregator.getAllQuotesAsync();
    }
}

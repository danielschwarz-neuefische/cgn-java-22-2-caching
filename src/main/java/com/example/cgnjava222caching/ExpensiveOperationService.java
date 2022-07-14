package com.example.cgnjava222caching;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ExpensiveOperationService {

    @Cacheable("MeaningOfLife")
    public String doExpensiveCalculation() {
        System.out.println("7,5 Millionen Jahre Rechenzeit"); // see https://de.wikipedia.org/wiki/42_(Antwort)
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "The answer is 42";
    }
}

package com.example.cgnjava222caching;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpensiveOperationRestController {

    private final ExpensiveOperationService expensiveOperationService;

    public ExpensiveOperationRestController(
            ExpensiveOperationService expensiveOperationService) {
        this.expensiveOperationService = expensiveOperationService;
    }

    @GetMapping
    public String get() {
        return expensiveOperationService.doExpensiveCalculation();
    }
}

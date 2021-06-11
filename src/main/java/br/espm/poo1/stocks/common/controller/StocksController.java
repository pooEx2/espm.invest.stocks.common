package br.espm.poo1.stocks.common.controller;

import br.espm.poo1.stocks.common.datatype.Stocks;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("stocks-service")
public interface StocksController {

    @GetMapping("/stocks")
    List<Stocks> stocks();

    @GetMapping("/stocks/{id}")
    Stocks stocks(@PathVariable String id);

    @GetMapping("/stocks/{symbol}/{date}")
    Stocks stocks(
            @PathVariable String symbol,
            @PathVariable String date
    );
}

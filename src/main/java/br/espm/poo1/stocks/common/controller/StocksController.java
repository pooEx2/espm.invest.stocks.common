package br.espm.poo1.stocks.common.controller;

import br.espm.poo1.stocks.common.datatype.Price;
import br.espm.poo1.stocks.common.datatype.Stocks;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("stocks-service")
@Controller
public interface StocksController {

    @GetMapping("/price")
    List<Price> prices();

    @GetMapping("/price/{id}")
    Price price(@PathVariable String id);

    @GetMapping("/price/{idStocks}/{date}")
    Price price(
            @PathVariable String idStocks,
            @PathVariable String date
    );

    @GetMapping("/stocks")
    List<Stocks> stocks();

    @GetMapping("/stocks/{symbol}")
    Stocks stocks(@PathVariable String symbol);

    @GetMapping("/stocks/{id}/{symbol}/{name}")
    List<Stocks> stocks(
            @PathVariable String id,
            @PathVariable String symbol,
            @PathVariable String name
    );


}

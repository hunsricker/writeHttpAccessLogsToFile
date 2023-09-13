package com.jambit;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller
public class RequestController {

    @Get
    @Produces("text/html")
    public String index() {
        return """
                <html>
                    <head>
                        <title>Test</title>
                    </head>
                    <body>
                        <h1>Test</h1>
                    </body>
                """;
    }
}

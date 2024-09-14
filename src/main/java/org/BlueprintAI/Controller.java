package org.BlueprintAI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/books")
    public String getBook() {
        return "hello spring boot";
    }

}

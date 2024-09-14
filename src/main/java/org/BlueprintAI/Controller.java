package org.BlueprintAI;

import org.BlueprintAI.Dao.Components;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Components components;

    @GetMapping("/components")
    public String getBook() {
        this.components.CreateTable();
        return "hello spring boot";
    }

}

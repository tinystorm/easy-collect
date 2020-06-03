package org.meng.easycollect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Meng
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/index")
    public String index() {
        return "Fuck u";
    }
}

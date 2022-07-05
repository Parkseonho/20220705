package com.mysite.sbbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/sb")
    @ResponseBody
    public String tester() {
        return "test";
    }

}

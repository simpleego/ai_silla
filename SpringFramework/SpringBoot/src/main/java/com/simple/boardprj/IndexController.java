package com.simple.boardprj;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class IndexController {

    @GetMapping("/hi")
    public String index(){
        log.info("index메서드 call");
        System.out.println("index 페이지 요청");
        return "index";
    }

}

package cn.jbit.vhr.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class TestController {
    @GetMapping("/test")
    public String getTest() {
        System.out.println("shanima");
        System.out.println("shabi?");
        return JSON.toJSONString("Stringjsdkaljfklsdjfkdslf");
    }

}

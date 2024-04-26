package kr.spring.tiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index.do")
    public String process() {
        return "index"; //  <definition name="index" template="/WEB-INF/tiles-view/template/layout.jsp"> 를 뜻함 (return "aaa"; 는 definition 태그의
        // name 속성값과 일치해야 하며, return 을 하면서 해당 name 속성값의 template 의 값(경로)의 페이지를 연결한다.
    }

    @RequestMapping("/menu1.do")
    public String menu1() {
        return "menu1";
    }

    @RequestMapping("/menu2.do")
    public String menu2() {
        return "menu2";
    }

}

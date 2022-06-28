package triple.review;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){//Model에 데이터를 넣고 뷰에 넘긴/
        model.addAttribute("data","조흔나의 웰컴페이지입니다.");
        return "hello";//리턴값은 화면이름!
    }
}

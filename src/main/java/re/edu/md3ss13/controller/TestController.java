package re.edu.md3ss13.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class TestController {
    @PostMapping("/test")
    public String test() {
        return "Đăng nhập thành công";
    }
}

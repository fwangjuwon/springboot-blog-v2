package site.metacoding.blogv2.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;
import site.metacoding.blogv2.domain.user.User;
import site.metacoding.blogv2.service.UserService;

@RequiredArgsConstructor
@Controller
public class UserController {
    private final UserService userService;
    private final HttpSession session;

    // App은 이 친구를 요청할 필요가 없다.
    // web은 이 친구를 요청해야한다.
    @GetMapping("/s/user/{id}")
    public String userInfo(@PathVariable Integer id /* , Model model */) {
        // User userEntity = userService.회원정보(id);
        // model.addAttribute("user", userEntity);
        return "user/updateForm";
    }

    // web browser -> 회원가입 페이지 주세요(말 됨)
    // 앱 -> 회원가입 페이지 주세요 (말 안됨)
    @GetMapping("/joinForm")
    public String joinForm() {
        return "user/joinForm";
    }

    @GetMapping("/loginForm")
    public String loginForm() {

        return "user/loginForm";
    }

    // @GetMapping("/logout")
    // public String logout() {
    // session.invalidate();
    // return "redirect:/";
    // }
}

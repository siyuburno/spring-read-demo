package mvc.controller;

import mvc.service.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mvc")
public class TestController {
    @Autowired
    private UserDao userDao;

    @GetMapping("/test")
    public ModelAndView testMvc() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        mv.addObject("title", userDao.getUserName());
        return mv;
    }
}

package JPA.Controller;

import JPA.CustomerService;
import JPA.Model.BlogModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private CustomerService customerService;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView getMyHomePage()
    {
        ModelAndView modelAndView = new ModelAndView("index");
        List<BlogModel> resultList= customerService.getAllBlog();
        modelAndView.addObject("result",resultList);
        modelAndView.addObject("BlogData",resultList);
        return modelAndView;
    }
}

package JPA.Controller;

import JPA.BlogService;
import JPA.Model.BlogModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/post")
public class BlogFormController {
    @Autowired
    private BlogService blogService;
    @RequestMapping(value = "/create",method = RequestMethod.GET)
    public String BlogAddForm(Model model)
    {
        BlogModel blogModel = new BlogModel();
        model.addAttribute("Blogger", blogModel);
        return "addYourBlog";
    }

    @RequestMapping(value  = "/create",method = RequestMethod.POST)
    public ModelAndView processBlog ( @ModelAttribute("Blogger") BlogModel blogModel) {
            ModelAndView modelAndView = new ModelAndView();
        System.out.println(blogModel);
        String result=blogService.saveMyblog(blogModel);
        modelAndView.setViewName("blogAdded");
          modelAndView.addObject("processResult",result);
            return modelAndView;

        }

    @RequestMapping(value = "/delete/{BlogId}",method = RequestMethod.GET)
    public ModelAndView deletedBlog(@PathVariable("BlogId") String blogId)
    {
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("DeleteBlog");
        BlogModel blogObject= blogService.viewBlog(Integer.parseInt(blogId)).get();
        modelAndView.addObject("BlogObject",blogObject);
        return  modelAndView;
    }
    @RequestMapping(value = "/delete/Confirm",method = RequestMethod.POST)
    public ModelAndView deletedConfirmBlog(@RequestParam("blogId") String id)
    {


        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("dataDeleted");
        return modelAndView;
    }
//
//    @RequestMapping(value = "/update/{BlogId}",method = RequestMethod.GET)
//    public ModelAndView updateBlog(@PathVariable("BlogId") String id)
//    {
//        int blogId = Integer.parseInt(id);
//        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
//        RetrieveInterface retrieveSingleBlog = applicationContext.getBean(RetrieveBlog.class);
//        ModelAndView modelAndView= new ModelAndView();
//        modelAndView.addObject("BlogObject",retrieveSingleBlog.getMyBlog(blogId));
////        System.out.println(request.getParameter("BlogId")+"svd");
//        modelAndView.addObject("BlogId",id);
//        modelAndView.setViewName("UpdateBlog");
//        return  modelAndView;
//    }
//    @RequestMapping(value = "updateConfirm",method = RequestMethod.POST)
//    public ModelAndView updatemyBlog(@ModelAttribute BlogModel blogModel)
//    {
//        System.out.println(blogModel);
//        ModelAndView modelAndView= new ModelAndView();
//        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
//        UpdateBlogInterface updateBlog= applicationContext.getBean(UpdateBlog.class);
//        updateBlog.updateMyblog(blogModel);
//        RetrieveInterface retrieveBlog= applicationContext.getBean(RetrieveBlog.class);
//        modelAndView.addObject("BlogData",retrieveBlog.getBlogData());
//        modelAndView.setViewName("DataSucess");
//        return modelAndView;
//    }
    @RequestMapping(value = "/view/{BlogId}",method = RequestMethod.GET)
    public ModelAndView showMyblog(@PathVariable("BlogId") String id)
    {

        int blogid = Integer.parseInt(id);

        BlogModel blogModel=blogService.viewBlog(blogid).get();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("ViewBlog",blogModel);
        modelAndView.setViewName("DisplayBlog");
        return modelAndView;
    }


}

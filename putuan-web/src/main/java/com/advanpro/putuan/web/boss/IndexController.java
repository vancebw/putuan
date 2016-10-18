package com.advanpro.putuan.web.boss;

import com.advanpro.putuan.web.common.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 作者： Joinly
 * 时间： 2016/7/18
 * 描述： ${todo}.
 */

@Controller
public class IndexController extends BaseController {

    @RequestMapping("/")
    public ModelAndView index(ModelAndView mv) {
        mv.setViewName("redirect:/boss");
        return mv;
    }

    @RequestMapping("/boss")
    public ModelAndView bossIndex() {
        ModelAndView mv = new ModelAndView("/boss/index");
        return mv;
    }

}
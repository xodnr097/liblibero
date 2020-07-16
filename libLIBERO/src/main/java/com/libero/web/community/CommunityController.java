package com.libero.web.community;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

import com.libero.service.community.CommunityService;
import com.libero.service.domain.Post;


@Controller
@RequestMapping("/commmunity/*")
public class CommunityController {
	
	@Autowired
	@Qualifier("communityServiceImpl")
	private CommunityService communityService;	
	

	public CommunityController() {
		System.out.println(this.getClass());
	}
	
	@RequestMapping(value="getPost", method=RequestMethod.GET)
	public ModelAndView getPost(@RequestParam("postNo") int postNo) throws Exception {
		
		System.out.println("/community/getPost : GET");
		
		ModelAndView modelAndView = new ModelAndView();
		
		Post post = communityService.getPost(postNo);
		
		modelAndView.setViewName("/view/community/getPost.jsp");
		modelAndView.addObject("post", post);
		
		return modelAndView;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

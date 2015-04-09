package com.youngball.Gather.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.youngball.Gather.domain.Survey;
import com.youngball.Gather.domain.User;
import com.youngball.Gather.service.SurveyService;

/**
 * 参与调查
 * @author lpz
 */
@Controller
@Scope("prototype")
public class EngageSurveyAction extends BaseAction<Survey> implements UserAware,ServletContextAware{

	private static final long serialVersionUID = -4668343023359766668L;

	private User user;
	private ServletContext sc;
	private List<Survey> surveys;
	
	public List<Survey> getSurveys() {
		return surveys;
	}

	public void setSurveys(List<Survey> surveys) {
		this.surveys = surveys;
	}

	@Resource
	private SurveyService surveyService;
	
	public void setUser(User user) {
		this.user = user;
	}

	public void setServletContext(ServletContext context) {
		this.sc = context;
	}
	
	/**
	 * 查找可以参与的surveys
	 * @return
	 */
	public String findAllAvailableSurveys(){
		this.surveys = surveyService.findAllAvailableSurveys();
		return "engageSurveyListPage";
	}
	

}
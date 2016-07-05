package lu.open.quiz.actions;

import java.util.Map;
import java.util.logging.Logger;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import lu.open.quiz.session.IaSession;
import lu.open.quiz.view.PageView;

public class HomeAction extends ActionSupport implements SessionAware, Preparable {


	private static final long serialVersionUID = 1L;

	protected static final Logger logger = Logger.getLogger(HomeAction.class.getName()) ;
	
	protected Map<String, String> libelles;
	
	protected IaSession iaSession;
	
	protected Map<String, Object> sessionMap;

	private String startTest;

	public String getStartTest() {
		return startTest;
	}

	public void setStartTest(String startTest) {
		this.startTest = startTest;
	}

	@Override
	public void prepare() throws Exception {
		if (libelles == null) {
			libelles = PageView.getLibelles();
		}
	}

	/**
	 * List of the actions and their results
	 */
	@Override
	public String execute() throws Exception {
		
		  Map<String, Object> session = ActionContext.getContext().getSession();
		  session.put("nomCandidat","Dupond");
		  session.put("prenomCandidat","Michel");
		  session.put("scoreCandidat",72.5);
		  
		  if(startTest!=null && !"".equals(startTest)){
			  return "START";
		  }
		  
		return "SUCCESS";
	}
	
	/**
	 * Set the sessionMap map
	 */
	@Override
	public void setSession(final Map<String, Object> map) {
		this.sessionMap = map;
	}

}

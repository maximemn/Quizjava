package lu.open.quiz.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import lu.open.quiz.session.IaSession;
import lu.open.quiz.view.PageView;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class PreviousQuestionAction extends ActionSupport implements SessionAware, Preparable {

	private static final long serialVersionUID = 1L;

	protected static final Logger logger = Logger.getLogger(PreviousQuestionAction.class.getName()) ;

	protected Map<String, String> libelles;

	protected IaSession iaSession;

	protected Map<String, Object> sessionMap;

	private String question;

	private List<String> answers;

	private String suivantBtn;
	private String precedentBtn;
	
	public String getSuivantBtn() {
		return suivantBtn;
	}

	public void setSuivantBtn(String suivantBtn) {
		this.suivantBtn = suivantBtn;
	}

	public String getPrecedentBtn() {
		return precedentBtn;
	}

	public void setPrecedentBtn(String precedentBtn) {
		this.precedentBtn = precedentBtn;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	@Override
	public void prepare() throws Exception {
		if (libelles == null) {
			libelles = PageView.getLibelles();

			setSession(ActionContext.getContext().getSession());

		}

	}

	@Override
	public void setSession(final Map<String, Object> map) {
		this.sessionMap = map;

	}


	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {

		System.out.println("Inside execute action");


		@SuppressWarnings("unchecked")
		Map<Integer,String> questionmap=(Map<Integer, String>) this.sessionMap.get("questionmap");
		@SuppressWarnings("unchecked")
		Map<Integer,List<String>> answermap=(Map<Integer, List<String>>) this.sessionMap.get("answermap");


		int index = 0;
		if(this.sessionMap.get("index")!=null){
			index = (Integer) this.sessionMap.get("index");}

			index--;
			Integer keys[] = (Integer[]) this.sessionMap.get("keys");
			setQuestion(questionmap.get(keys[index]));
			setAnswers(answermap.get(keys[index]));
			sessionMap.put("index",index);

			return "SUCCESS";
		
	}

}

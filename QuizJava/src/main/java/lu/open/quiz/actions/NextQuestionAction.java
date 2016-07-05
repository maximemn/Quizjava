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

public class NextQuestionAction extends ActionSupport implements SessionAware, Preparable {

	private static final long serialVersionUID = 1L;

	protected static final Logger logger = Logger.getLogger(NextQuestionAction.class.getName()) ;

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

			if(!this.sessionMap.containsKey("questionmap")){
				Map<Integer,String> questionmap=new HashMap<Integer,String>();
				Map<Integer,List<String>> answermap=new HashMap<Integer,List<String>>();

				/*Used for testing*/
				questionmap.put(0,"Qu'est-ce que Java ?");
				ArrayList<String> test = new ArrayList<String>();
				test.add("Une île");
				test.add("Un langage");
				test.add("Une danse");
				test.add("Obiwan kenobi");
				answermap.put(0,test);

				questionmap.put(1,"Qu'est-ce que Java2 ?");
				ArrayList<String> test2 = new ArrayList<String>();
				test2.add("Une île2");
				test2.add("Un langage2");
				test2.add("Une danse2");
				test2.add("Obiwan kenobi2");
				answermap.put(1,test2);

				/*End of test values*/

				Map<Integer,Boolean> candidateanswers = new HashMap<Integer,Boolean>();
				this.sessionMap.put("questionmap",questionmap);
				this.sessionMap.put("answermap",answermap);
				this.sessionMap.put("candidateanswers",candidateanswers);
				int index=-1;
				this.sessionMap.put("index",index);
				System.out.println("Index:"+this.sessionMap.get("index"));

				Set<Integer> keySet = questionmap.keySet();
				Integer keys[] = new Integer[keySet.size()];
				keys=keySet.toArray(keys);

				this.sessionMap.put("keys",keys);


			}

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
/*
		if( index == -1 || suivantBtn!=null && !"".equals(suivantBtn))
		{	*/
			System.out.println(index);
			index++;
			System.out.println(index);
			Integer keys[] = (Integer[]) this.sessionMap.get("keys");
			setQuestion(questionmap.get(keys[index]));
			setAnswers(answermap.get(keys[index]));
			System.out.println(getQuestion());
			System.out.println(getAnswers());
			sessionMap.put("index",index);
			
			return "SUCCESS";	
		/*}
		else if(precedentBtn!=null && !"".equals(precedentBtn))
		{
			index--;
			Integer keys[] = (Integer[]) this.sessionMap.get("keys");
			setQuestion(questionmap.get(keys[index]));
			setAnswers(answermap.get(keys[index]));
			sessionMap.put("index",index);

			return "SUCCESS";
		}*/

	}

}

package lu.open.quiz.view;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class PageView implements Serializable {

	private static final long serialVersionUID = -3127329132414064498L;

	private static Map<String, String> libelles;

	public static Map<String, String> getLibelles() {
		if (libelles == null) {
			libelles = new HashMap<String, String>();
		}
		return libelles;
	}

	public static void setLibelles(Map<String, String> libelles) {
		PageView.libelles = libelles;
	}
	
	
}

package lu.open.quiz.servlet;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import lu.open.quiz.common.Constants;
import lu.open.quiz.view.PageView;



public class CacheServletCtxtListener implements ServletContextListener {
	
	protected static final Logger logger = Logger.getLogger("CacheServletCtxtListener") ;

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void contextInitialized(final ServletContextEvent servletCtxtEvent) {


//		final Map<String, String> resMap = getLibelles();
//
//		if (resMap != null) {
//			final Map<String, String> libelles = new LinkedHashMap<String, String>();
//
//
//			for (final String key : resMap.keySet()) {
//				libelles.put(key, resMap.get(key));
//			}
//
//			PageView.setLibelles(libelles);
//			logger.finest(String.valueOf(PageView.getLibelles().size()));
//
//		} else {
//			throw new RuntimeException("An error occurred while trying to read Labels.properties file");
//		}
	
	}

	
	public Map<String, String> getLibelles() {
		
		Map<String, String> resMap = new LinkedHashMap<String, String>();

		final Properties prop = new Properties();

		try {
			final InputStream input = this.getClass().getResourceAsStream("/Labels.properties");
			final Reader reader = new InputStreamReader(input, Constants.UTF8);
			prop.load(reader);
			final Enumeration<Object> e = prop.keys();

			while (e.hasMoreElements()) {
				final String k = (String) e.nextElement();
				resMap.put(k, prop.getProperty(k));
			}
		} catch (final Exception e) {
			logger.log(Level.SEVERE, "Reading properties file failed ", e);
			resMap = null;
		}
		return resMap;
	}


	
	

}
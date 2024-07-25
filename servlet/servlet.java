package servlet;

public class servlet {

	public static void main(String[] args) {
		
		/*
		 Servlet(Java) -> Is a specification to build dynamic web Applications using Java.
		 			-1996.
		 			-Servlet is more efficient than CGI.
		 			-Servlet Create Dynamic web pages.
		 			-Servlet(req-res,mechanism).
		 			-Apache TomCat(Web server,slw).
		 			
		 CGI(common gateway interface)(multiple languages can be used) -> c,c++,pearl
		 
		(Request)	 R1-> |		| ->p1 		(process)
					 R2>  |		| ->p2
					 R1-> |		| ->p1
		 
		 set path=C:\Program Files\Java\jdk.16.0.1\bin
		 
		 
		 C:\Users\91976>set classpath="%classpath%".;C:\Program Files (x86)\Apache Softjavap jakarta.servlet.Servlet
Compiled from "Servlet.java"
public interface jakarta.servlet.Servlet {
  public abstract void init(jakarta.servlet.ServletConfig) throws jakarta.servlet.ServletException;
  public abstract jakarta.servlet.ServletConfig getServletConfig();
  public abstract void service(jakarta.servlet.ServletRequest, jakarta.servlet.ServletResponse) throws jakarta.servlet.ServletException, java.io.IOException;
  public abstract java.lang.String getServletInfo();
  public abstract void destroy();
}

5-abstract methods
		 
		 
		 
		 C:\Users\91976>javap jakarta.servlet.GenericServlet
Compiled from "GenericServlet.java"
public abstract class jakarta.servlet.GenericServlet implements jakarta.servlet.Servlet,jakarta.servlet.ServletConfig,java.io.Serializable {
  public jakarta.servlet.GenericServlet();
  public void destroy();
  public java.lang.String getInitParameter(java.lang.String);
  public java.util.Enumeration<java.lang.String> getInitParameterNames();
  public jakarta.servlet.ServletConfig getServletConfig();
  public jakarta.servlet.ServletContext getServletContext();
  public java.lang.String getServletInfo();
  public void init(jakarta.servlet.ServletConfig) throws jakarta.servlet.ServletException;
  public void init() throws jakarta.servlet.ServletException;
  public void log(java.lang.String);
  public void log(java.lang.String, java.lang.Throwable);
  public abstract void service(jakarta.servlet.ServletRequest, jakarta.servlet.ServletResponse) throws jakarta.servlet.ServletException, java.io.IOException;
  public java.lang.String getServletName();
}

		
		 C:\Users\91976>javap jakarta.servlet.http.HttpServlet
Compiled from "HttpServlet.java"
public abstract class jakarta.servlet.http.HttpServlet extends jakarta.servlet.GenericServlet {
  public static final java.lang.String LEGACY_DO_HEAD;
  public jakarta.servlet.http.HttpServlet();
  public void init(jakarta.servlet.ServletConfig) throws jakarta.servlet.ServletException;
  protected void doGet(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse) throws jakarta.servlet.ServletException, java.io.IOException;
  protected long getLastModified(jakarta.servlet.http.HttpServletRequest);
  protected void doHead(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse) throws jakarta.servlet.ServletException, java.io.IOException;
  protected void doPost(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse) throws jakarta.servlet.ServletException, java.io.IOException;
  protected void doPut(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse) throws jakarta.servlet.ServletException, java.io.IOException;
  protected void doDelete(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse) throws jakarta.servlet.ServletException, java.io.IOException;
  protected void doOptions(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse) throws jakarta.servlet.ServletException, java.io.IOException;
  protected void doTrace(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse) throws jakarta.servlet.ServletException, java.io.IOException;
  protected void service(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse) throws jakarta.servlet.ServletException, java.io.IOException;
  public void service(jakarta.servlet.ServletRequest, jakarta.servlet.ServletResponse) throws jakarta.servlet.ServletException, java.io.IOException;
  static {};
}
		 
		 
		 */
		
	}
}

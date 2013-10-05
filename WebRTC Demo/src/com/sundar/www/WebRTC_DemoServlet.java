package com.sundar.www;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class WebRTC_DemoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		System.out.println("I changed Something!");
	}
}

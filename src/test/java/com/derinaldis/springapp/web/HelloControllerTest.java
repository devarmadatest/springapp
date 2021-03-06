package com.derinaldis.springapp.web;

import org.springframework.web.servlet.ModelAndView;
import com.derinaldis.springapp.web.HelloController;
import junit.framework.TestCase;

public class HelloControllerTest extends TestCase {

public void testHandleRequestView() throws Exception {
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull(nowValue);
}

}

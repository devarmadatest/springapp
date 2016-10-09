package com.derinaldis.springapp.web;

import org.springframework.web.servlet.ModelAndView;
import com.derinaldis.springapp.web.InventoryController;
import junit.framework.TestCase;

public class InventoryControllerTest extends TestCase {

public void testHandleRequestView() throws Exception {
        InventoryController controller = new InventoryController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull(nowValue);
}

}

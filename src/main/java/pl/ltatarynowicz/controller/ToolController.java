package pl.ltatarynowicz.controller;

import pl.ltatarynowicz.model.Type;
import pl.ltatarynowicz.service.ToolService;
import pl.ltatarynowicz.service.ToolServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class ToolController extends HttpServlet {

    private final String TOOLS_PAGE_PATH = "/tools.jsp";

    private final ToolService toolServiceImpl = new ToolServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        toolServiceImpl.getAllTools();
        req.getSession().setAttribute("tool", toolServiceImpl.getAllTools());
        getServletContext().getRequestDispatcher(TOOLS_PAGE_PATH).forward(req, resp);
    }
}

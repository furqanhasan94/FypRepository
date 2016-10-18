/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ned.bcvs.admin.web;


import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ned.bcvs.admin.AdminEditActionsLocal;

/**
 *
 * @author StackHouse
 */
@WebServlet(urlPatterns = "/s1")
public class S1 extends HttpServlet {

    @EJB
    private AdminEditActionsLocal adminEditActionsLocal;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter w = resp.getWriter();
        w.println(adminEditActionsLocal.getConstituencyTypes("ABC"));
        w.close();
    }
}

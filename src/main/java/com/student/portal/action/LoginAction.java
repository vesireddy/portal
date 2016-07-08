package com.student.portal.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.student.portal.dao.StudentRegistrationDAO;
import com.student.portal.vo.StudentVO;

/**
 * This class acts as the controller for the login navigation.
 *
 */
public class LoginAction extends Action {

	/**
	 * This method accepts the request processes the requests and returns the
	 * response after executing the business logic.
	 *
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		String forward = null;
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		StudentRegistrationDAO registrationDAO = new StudentRegistrationDAO();
		StudentVO studentVO = registrationDAO.validateStudent(email, password);

		if (studentVO.isValidStudent()) {

			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("STUDENT_DETAILS", studentVO);
			forward = "loginsuccess";
		} else {
			forward = "loginfailure";
		}

		return mapping.findForward(forward);
	}
}

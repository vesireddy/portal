package com.student.portal.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.student.portal.dao.StudentRegistrationDAO;
import com.student.portal.vo.StudentVO;

/**
 * This class acts as the controller for the registration process.
 *
 */
public class RegisterStudentAction extends Action {

	/**
	 * This method accepts the request.Processes the requests and returns the
	 * response after executing the business logic.
	 *
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		RegisterActionForm registerForm = (RegisterActionForm) form;

		StudentVO studentVO = new StudentVO();
		studentVO.setFirstName(registerForm.getFirstName());
		studentVO.setLastName(registerForm.getLastName());
		studentVO.setPassword(registerForm.getPassword());
		studentVO.setEmail(registerForm.getEmail());
		studentVO.setCity(registerForm.getCity());
		studentVO.setZip(registerForm.getZip());

		StudentRegistrationDAO registrationDAO = new StudentRegistrationDAO();
		registrationDAO.registerStudent(studentVO);

		return mapping.findForward("success");
	}
}

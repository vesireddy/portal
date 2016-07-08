


package com.student.portal.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * This class acts as the controller for user session logout.
 *
 */
public class LogoutAction extends Action {

	/**
	 * This method accepts the request processes the requests and returns the
	 * response after executing the business logic.
	 *
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();
		session.invalidate();
		return mapping.findForward("logout");
	}
}

package com.tmf.demo.servlets;

import java.io.IOException;
import java.sql.Date;

import com.tmf.easymedicine.models.Medicine;
import com.tmf.easymedicine.services.MedicineServiceImpl;
import com.tmf.easymedicine.services.MedicineServices;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddMedicine extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * Use getParameter("") function to accept data from
		 * outside the servlet to the current servlet.
		 * The getParameter("") function is available in ServletRequest Interface.
		 * The getParameter("") function returns the data in the form of a string.
		 */
		
		int id = Integer.parseInt(req.getParameter("mid"));
		String cName= req.getParameter("mcompany");
		String type = req.getParameter("mtype");
		String purpose= req.getParameter("mpurpose");
		String desc = req.getParameter("mdesc");
		String dosage = req.getParameter("mdosage");
		String mName = req.getParameter("mname");
		Date doe = Date.valueOf(req.getParameter("mdoe"));
		Date dom = Date.valueOf(req.getParameter("mdom"));
		double ppu = Double.parseDouble(req.getParameter("mppu"));
		double pps = (ppu*0.02) * 10;
		
		resp.setContentType("text/html");
		/*resp.getWriter().println("<table>");
		resp.getWriter().println("<tr><th>Medicine Id</th><td>"+id+"</td></tr>");
		resp.getWriter().println("<tr><th>Medicine Name</th><td>"+mName+"</td></tr>");
		resp.getWriter().println("<tr><th>Company Name</th><td>"+cName+"</td></tr>");
		resp.getWriter().println("<tr><th>Purpose</th><td>"+purpose+"</td></tr>");
		resp.getWriter().println("<tr><th>Type</th><td>"+type+"</td></tr>");
		resp.getWriter().println("<tr><th>Dosage</th><td>"+dosage+"</td></tr>");
		resp.getWriter().println("<tr><th>Description</th><td>"+desc+"</td></tr>");
		resp.getWriter().println("<tr><th>Date of Manufacturing</th><td>"+dom+"</td></tr>");
		resp.getWriter().println("<tr><th>Date of Expiry</th><td>"+doe+"</td></tr>");
		resp.getWriter().println("<tr><th>Price Per Unit</th><td>"+ppu+"</td></tr>");
		
		resp.getWriter().println("</table>");
		*/
		//Creating an object for the model class
		Medicine med = new Medicine();
		
		//Set all the values to the model class object.
		med.setCompanyName(cName);
		med.setDoe(doe);
		med.setDom(dom);
		med.setDosage(dosage);
		med.setDrugDescription(desc);
		med.setMedId(id);
		med.setMedName(mName);
		med.setPricePerStrip(pps);
		med.setPricePerUnit(ppu);
		med.setPurpose(purpose);
		med.setTypeOfMedicine(type);
		
		//Create a Service object
		MedicineServices service = new MedicineServiceImpl();
		
		//Call the service method to save the medicine.
		service.addMedicine(med);
		
		resp.getWriter().println("<h3><font color='green'>Medicine got add Successfully</font></h3>");
	}
}

package com.company.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.company.dao.pojo.Emp;
import com.company.service.iservice.EmpService;

@Controller
@RequestMapping("emp")
public class aaaAction {
	@Autowired
	private EmpService empService;
	
	//参数传递
	@RequestMapping(value="detail",method=RequestMethod.GET)
//	public String findById1(int empno){
//	public String findById1(Integer empno){
	
	//数据返回
	public ModelAndView findById(Integer empno){
		Emp emp = empService.findById(empno);
		ModelAndView mav = new ModelAndView();
		mav.addObject("emp", emp);
		mav.setViewName("find_emp");
		System.out.println(mav);
		return mav;
	}
	
	@RequestMapping(value="detail2",method=RequestMethod.GET)
	public String findById(Integer empno,Map<String,Object> map){
		Emp emp = empService.findById(empno);
		
		map.put("emp", emp);
		
		return "find_emp";
	}
	
	@RequestMapping(value="detail3",method=RequestMethod.GET)
	public String findById(Integer empno,Model model){
		Emp emp = empService.findById(empno);
		
		model.addAttribute("emp", emp);
		
		return "find_emp";
	}
	
	@RequestMapping(value="detail4",method=RequestMethod.GET)
	public String findById(HttpServletRequest request){
		Emp emp = empService.findById(Integer.parseInt(request.getParameter("empno")));
		
		request.setAttribute("emp", emp);
		
		return "find_emp";
	}	
	
	@RequestMapping("session_demo")
	public String routerSession(){
		return "session_demo";
	}
	
	@RequestMapping(value="redirection",method=RequestMethod.GET)
	public String findById(int empno,HttpSession session){
		Emp emp = empService.findById(empno);
		session.setAttribute("ename", emp.getEname());
//		return "redirect:/session_demo.jsp";//根目录下的session_demo.jsp
		return "redirect:session_demo";
	}	
	
}
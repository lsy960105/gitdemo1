package com.company.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.company.dao.pojo.Dept;
import com.company.service.iservice.DeptService;
import com.opensymphony.xwork2.ModelDriven;

@Controller("deptAction")
@Scope("prototype")
public class DeptAction implements ModelDriven<Dept>, RequestAware {

	@Autowired
	private DeptService DeptService;

	private Dept DeptModel = new Dept();

	private int pageNo;
	private int pageSize = 5;
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public Dept getModel() {
		return DeptModel;
	}

	private Map<String, Object> requestMap;

	@Override
	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;
	}

	public String DeptSave() {
		return DeptService.save(DeptModel);
	}

	public String DeptDelete() {
		return DeptService.delete(DeptModel);
	}

	public String DeptUpdate() {
		return DeptService.update(DeptModel);
	}

	public String DeptFindByPage() {
		String msg = "error";
		if (pageNo < 1) {
			pageNo = 1;
		}
		List<Dept> DeptList = DeptService.findByPage(pageNo, pageSize);
		if (DeptList != null && DeptList.size() > 0) {
			requestMap.put("DeptListFromServer", DeptList);
		}
		return msg;
	}

	public String DeptFindById() {
		String msg = "error";
		Dept Dept = DeptService.findById(DeptModel.getDeptno());
		if (Dept != null) {

			if ("update".equals(type)) {
				ServletActionContext.getRequest().setAttribute("Dept", Dept);
				return "updateFromFindById";
			} else {
				List<Dept> DeptList = new ArrayList<Dept>();
				DeptList.add(Dept);
				// ServletActionContext.getRequest().setAttribute("DeptListFromServer",
				// DeptList);
				requestMap.put("DeptListFromServer", DeptList);
				msg = "success";
			}
		}
		return msg;
	}

	
}

package com.ns.hibernateCustomIdGeneration.GetID_From_Table.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ns.hibernateCustomIdGeneration.GetID_From_Table.model.Department;
import com.ns.hibernateCustomIdGeneration.GetID_From_Table.repository.DepartmentRepository;

@Controller
@RequestMapping("/department")
public class RecordCreatorComponent {

	@Autowired
	DepartmentRepository depRepo;

	@GetMapping
	public String root() {
		List<Department> deptList = new ArrayList<>();

		Department dept1 = new Department();
		dept1.setDeptName("Engineering");
		dept1.setDeptDesc("Engineering Department");
		deptList.add(dept1);

		Department dept2 = new Department();
		dept2.setDeptName("HR");
		dept2.setDeptDesc("Human Resorces Department");
		deptList.add(dept2);

		Department dept3 = new Department();
		dept3.setDeptName("Finance");
		dept3.setDeptDesc("Finance Department");
		deptList.add(dept3);

		deptList.forEach(d -> {
			Department dp = depRepo.findByDeptName(d.getDeptName());
			if (null == dp) {
				depRepo.save(d);
			}
		});

		return "Hello World";
	}

}

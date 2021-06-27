package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entity.Courses;
@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao cD;
	
	
//	List<Courses> list;
	
	public CourseServiceImpl() {
		/*list=new ArrayList<>();
		list.add(new Courses(1212,"Java","Core"));
		list.add(new Courses(1213,"Java","Advance"));
		list.add(new Courses(1214,"Java","Core+Advance"));
		list.add(new Courses(1215,"Java","Fulstack"));*/
		
	}
	
	
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return cD.findAll();
	}


	@Override
	public Courses getCourse(long courseId) {
//		Courses temp = null;
//		for(Courses c:list) {
//			if(c.getId()==courseId) {
//				temp=c;
//			}
//		}
		return cD.getOne(courseId);
	}


	@Override
	public Courses addCourse(Courses course) {
//		list.add(course);
		cD.save(course);
		return course;
	}

}

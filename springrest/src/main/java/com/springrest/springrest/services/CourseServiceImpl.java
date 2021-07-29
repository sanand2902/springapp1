package com.springrest.springrest.services;

//package com.springtest.springtest.dao.CourseDao;


import java.util.ArrayList;
import java.util.List;
//import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {

//	@Autowired()
//	private CourseDao courseDao;
	
	List<Course> list;

	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(145, "java1", "desc1", "tutor1"));
		list.add(new Course(146, "java2", "desc2", "tutor2"));
		list.add(new Course(147, "java3", "desc3", "tutor3"));
	}

	
	@Override
	public List<Course> getCourses() {
//		return courseDao.findAll();
		return list;
	}
	
	
	@Override
	public Course getCourse(long courseId) {
		Course c=null;
		for(Course course : list) {
			if(course.getId() == courseId) {
				c = course;
				break;
			}
		}
		return c;

//		return courseDao.getById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
//		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		list.forEach(e -> {
			if(e.getId() == course.getId()) {
				e.setTitle(course.getTitle());
				e.setDesc(course.getDesc());
				e.setTutor(course.getTutor());
			}
		});
//		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
		list = this.list.stream().filter(e -> {
			return e.getId() != courseId;
		}).collect(Collectors.toList());
//		courseDao.deleteById(courseId);
	}

}

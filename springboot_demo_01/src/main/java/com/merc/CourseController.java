package com.merc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhongchongyuan on 2023/2/14 20:54
 */


@RestController
public class CourseController {

//courses
// Course: id, name,author
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
         new Course(1,"Lear AWS","Merc"),
         new Course(2,"Lear DevOps","Merc"),
         new Course(3,"Lear Azure","Merc")
        );
    }
}

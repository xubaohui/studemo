package com.example.sbdemo2;

import com.example.sbdemo2.dao.StudentsMapper;
import com.example.sbdemo2.entity.Students;
import com.example.sbdemo2.entity.StudentsExample;
import com.example.sbdemo2.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)  //以spring的方式运行
@SpringBootTest  //spri动ngboot工程测试  自动从启动类运行
public class Sbdemo2ApplicationTests {
    //注入相应的测试dao层组件、业务组件
    //@Autowired
    //private StudentsMapper studentsMapper;

    @Autowired
    private StudentService studentService;


    //一个方法一个测试用例
    @Test
    public void contextLoads() {
        List<Students> list1=this.studentService.getAllStudent();
        System.out.println("总共查询到多少行:"+list1.size());
    }

}

package net.sunofbeach.blog;

import net.sunofbeach.blog.pojo.TestHouse;
import net.sunofbeach.blog.pojo.TestUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

/**
 * @author Danny
 * @date 2021/8/9 17:11
 */

@Controller
@ResponseBody
@CrossOrigin
@RequestMapping("/blog")
public class TestController implements Serializable {
    @GetMapping("/test")
    public String helWorld(){
        return "hello world !";
    }

    @GetMapping("/test-json")
    public TestUser testJson() {
        TestUser testUser = new TestUser("dingrui", "男", "15656550098");
        TestHouse testHouse = new TestHouse("上海市浦东新区唐镇1号楼201室", "12345");
        testUser.setTestHouse(testHouse);
        return testUser;

    }
}



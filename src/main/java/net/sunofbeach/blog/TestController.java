package net.sunofbeach.blog;

import net.sunofbeach.blog.pojo.TestHouse;
import net.sunofbeach.blog.pojo.TestUser;
import net.sunofbeach.blog.pojo.User;
import net.sunofbeach.blog.response.ResponeResult;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

/**
 * @author Danny
 * @date 2021/8/9 17:11
 */

@RestController
@CrossOrigin
@RequestMapping("/blog")
public class TestController implements Serializable {
    @GetMapping("/test")
    public ResponeResult helWorld(){
//        ResponeResult responeResult = new ResponeResult(ResponseState.FAILED);
//        responeResult.setData("");
        return ResponeResult.FAILED().setData("");
    }

    @GetMapping("/test-json")
    public ResponeResult testJson() {
        TestUser testUser = new TestUser("dingrui", "男", "15656550098");
        TestHouse testHouse = new TestHouse("上海市浦东新区唐镇1号楼201室", "12345");
        testUser.setTestHouse(testHouse);
//        ResponeResult responeResult = new ResponeResult(ResponseState.SUCCESS);
//        responeResult.setData(testUser);
        return ResponeResult.SUCCESS().setData(testUser);
    }

    @PostMapping("test-login")
    public ResponeResult testLogin(@RequestBody User user) {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return ResponeResult.LOGIN_SUCCESS("登录成功！");
    }
}



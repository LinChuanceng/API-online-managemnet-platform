package lin.apiinterface.controller;/**
 * @author 廖涛涛
 * @version 1.0
 * @date now()
 */


import com.lin.apiclientsdk.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @description TODO
 * @author 鏋楀窛鎴�
 * @date 2023/4/17 9:41
 * @version 1.0
 */
@RestController()
@Slf4j
@RequestMapping("/name")
public class NameController {
    @GetMapping("/")
    public String getNameByGet(String name){
        return "GET 你的名字是：" +name;
    }
    @PostMapping("/")
    public String getNameByPost(@RequestParam String name){
        return "POST 你的名字是：" +name;
    }
    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request){

        return "POST 你的名字是：" +user.getUsername();
    }
}

package jeeno.demo.springbootswagger2.controller;

import io.swagger.annotations.*;
import jeeno.demo.springbootswagger2.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Jeeno
 * @mail: jeenocruise@gmail.com
 * @date: 2019/7/8 16:47
 */
@Api(tags="MyController related APIs")
@RestController
public class MyController {

    @GetMapping("/hi")
    @ApiOperation("sayHi API")
    public String sayHi(){
        return "hello, there.";
    }

    @PostMapping("/login")
    @ApiOperation("login API")
    @ApiImplicitParam(name = "user", value = "User class", required = true, dataType = "User")
    public Boolean login(@RequestBody User user){
        return "admin".equals(user.getUsername());
    }

}

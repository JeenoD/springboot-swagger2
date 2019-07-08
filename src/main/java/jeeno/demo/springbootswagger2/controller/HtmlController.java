package jeeno.demo.springbootswagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: Jeeno
 * @mail: jeenocruise@gmail.com
 * @date: 2019/7/8 16:27
 */
@Api(tags="HtmlController related APIs")
@Controller
public class HtmlController {

    @GetMapping("/index")
    @ApiOperation("index API")
    public String index(){
        return "index";
    }

}

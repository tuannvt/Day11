package mvc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @RequestMapping(value = "/hello1")
    public String greeting(@RequestParam(name = "name") String name,
                              @RequestParam(name = "country",required = false,defaultValue = "Viet Nam")String country){
        return "Hello "+name+" from "+country;
    }
    @RequestMapping(value = "/hello2")
    public Object greeting2(@RequestParam(name = "name") String name,
                           @RequestParam(name = "country")String country){
        Map<String,String> result=new HashMap<>();
        result.put("name",name);
        result.put("country",country);
        return result;
    }
    @RequestMapping(value = "/hello3/{name}/{country}")
    public Object greeting3(@PathVariable(name = "name") String name,
                            @PathVariable(name = "country")String country){
        Map<String,String> result=new HashMap<>();
        result.put("name",name);
        result.put("country",country);
        return result;
    }

}

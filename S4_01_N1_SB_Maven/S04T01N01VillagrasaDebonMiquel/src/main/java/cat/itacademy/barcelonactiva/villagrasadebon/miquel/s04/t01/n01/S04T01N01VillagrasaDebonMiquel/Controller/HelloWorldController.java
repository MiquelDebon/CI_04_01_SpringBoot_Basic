package cat.itacademy.barcelonactiva.villagrasadebon.miquel.s04.t01.n01.S04T01N01VillagrasaDebonMiquel.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {

    /*
    References: https://www.baeldung.com/spring-requestparam-vs-pathvariable#query-parameter-vs-uri-path

    Query Parameter vs URI Path:
    @RequestParams != @PathVariables:
    While @RequestParams extract values from the query string, @PathVariables extract values from the URI path

    @GetMapping != @RequestMapping:
    @GetMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.GET).
    @GetMapping is the newer annotation. It supports consumes
     */

    @RequestMapping(value = "/HelloWorld", method = RequestMethod.GET)
    public String saluda(@RequestParam(name="name", required=false, defaultValue="UNKNOWN") String name, Model model){
        //http://localhost:9000/HelloWorld?name=Miquel
        //http://localhost:9000/HelloWorld
        model.addAttribute("name", name);
        return "greeting";
    }


    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String saluda2(@PathVariable(name="name", required=false) String name, Model model){
        //http://localhost:9000/HelloWorld2
        //http://localhost:9000/HelloWorld2/Miquel
        model.addAttribute("name", name);
        return "greeting";
    }
    
}

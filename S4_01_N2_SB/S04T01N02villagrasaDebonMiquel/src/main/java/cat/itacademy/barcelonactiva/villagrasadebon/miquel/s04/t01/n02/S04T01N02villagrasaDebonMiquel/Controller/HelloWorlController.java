package cat.itacademy.barcelonactiva.villagrasadebon.miquel.s04.t01.n02.S04T01N02villagrasaDebonMiquel.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class HelloWorlController {
    @GetMapping(value = "/HelloWorld")
    public String saluda(@RequestParam(name="name", required=false, defaultValue="UNKNOWN") String name, Model model){
        //http://localhost:9001/HelloWorld?name=Miquel
        //http://localhost:9001/HelloWorld
        model.addAttribute("name", name);
        return "greeting";
    }


    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String saluda2(@PathVariable(name="name", required=false) String name, Model model){
        //http://localhost:9001/HelloWorld2
        //http://localhost:9001/HelloWorld2/Miquel
        model.addAttribute("name", name);
        return "greeting";
    }
}

package mongo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/documentation")
public class DocumentationController {

    @GetMapping
    public String home() {
        return "Home";
    }
}

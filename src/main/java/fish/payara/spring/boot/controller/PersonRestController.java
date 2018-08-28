package fish.payara.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/person")
public class PersonRestController {

    Map<Integer, String> personMap = new HashMap<Integer, String>();

    @PostConstruct
    public void init() {
        personMap.put(1, "test");
        personMap.put(2, "test2");
        personMap.put(3, "test3");
    }

    @RequestMapping("/all")
    public Collection<String> getAll() {
        return personMap.values();
    }
}
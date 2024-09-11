package org.kte.github_actions;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(path = "sa",produces = MediaType.APPLICATION_JSON_VALUE)
public class SaController {

    @GetMapping
    public List<Object> search(){
        return List.of(new Sa(1, "gute bildung", 1));
    }
}

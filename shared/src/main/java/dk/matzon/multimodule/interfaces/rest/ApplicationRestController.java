package dk.matzon.multimodule.interfaces.rest;

import dk.matzon.multimodule.model.dto.ResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class ApplicationRestController {

    @GetMapping("/")
    public ResponseDTO alive() {
        return new ResponseDTO(true, "very-much");
    }
}

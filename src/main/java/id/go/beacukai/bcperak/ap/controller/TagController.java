package id.go.beacukai.bcperak.ap.controller;

import id.go.beacukai.bcperak.ap.entity.Tag;
import id.go.beacukai.bcperak.ap.service.TagService;
import id.go.beacukai.bcperak.ap.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "tag")
public class TagController {

    @Autowired
    TagService tagService;

    private String service = "tag";

    @PostMapping
    ResponseEntity<Response> create (@RequestBody @Validated Tag tag){
        String nameOfCurrentMethod = new Throwable()
                .getStackTrace()[0]
                .getMethodName();

        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrentMethod);
        response.setMessage("Berhasil membuat data");

        response.setData(tagService.create(tag));

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

}

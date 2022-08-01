package za.co.imgn.apical;

import io.micronaut.http.annotation.*;

@Controller("/apiCal")
public class ApiCalController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}
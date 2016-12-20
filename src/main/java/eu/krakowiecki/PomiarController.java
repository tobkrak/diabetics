package eu.krakowiecki;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by tobkrak on 20.12.2016.
 */
@RestController
public class PomiarController {

    Date date = new Date();
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");

    @RequestMapping("/pom")
    public Pomiar pom(@RequestParam(value="pomiar") int pomiar) {
        return new Pomiar(pomiar, dateFormat.format(date));
    }
}
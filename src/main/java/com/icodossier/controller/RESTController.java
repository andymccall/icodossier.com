package com.icodossier.controller;

import com.icodossier.model.GenericJsonResponse;
import com.icodossier.model.Ping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.time.Clock;
import java.util.Arrays;

/**
 * The RESTController is the main controller where all the APIs are
 * called from.
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2017-10-21
 */
@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api/")
public class RESTController {

    private Clock clock = Clock.systemDefaultZone();

    private static final Logger logger =
            LoggerFactory.getLogger(RESTController.class);

    /**
     * Gets the Ping json for the controller.
     *
     * @return GenericJsonResponse.
     */
    @RequestMapping(value = "/ping", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public @ResponseBody
    GenericJsonResponse getPing() {

        logger.debug("Entering getPing()");

        Ping ping = new Ping(clock);

        GenericJsonResponse<Ping> pingJsonResponse = new GenericJsonResponse<Ping>();

        pingJsonResponse.setResult(Arrays.asList(ping));

        pingJsonResponse.setStatus(200);

        logger.debug("Exiting getPing()");
        return (pingJsonResponse);
    }

}

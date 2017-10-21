package com.icodossier.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * The WebController is the main controller where all the APIs are
 * called from.
 *
 * @author Andy McCall
 * @version 0.1
 * @since 2017-10-21
 */
@Controller
public class WebController {

    private static final Logger logger =
            LoggerFactory.getLogger(WebController.class);

    /**
     * Gets the main index for the controller.
     *
     * @return String.
     */
    @RequestMapping(value = {"/", "index"}, method = RequestMethod.GET)
    public String homepage() {

        logger.debug("Entering homepage()");

        return "index";

    }

    /**
     * Gets the ping page for the controller.
     *
     * @return String.
     */
    @RequestMapping(value = {"ping"}, method = RequestMethod.GET)
    public String ping() {

        logger.debug("Entering ping()");

        return "ping";

    }

}

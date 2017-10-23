package com.icodossier;

import org.springframework.boot.SpringApplication;

/**
 * The Application class is the entry point to the main program
 *
 * @author Andy McCall, mailme@andymccall.co.uk
 * @version 0.3
 * @since 2017-10-21
 */
public class ApplicationMain {

    protected ApplicationMain() {

    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

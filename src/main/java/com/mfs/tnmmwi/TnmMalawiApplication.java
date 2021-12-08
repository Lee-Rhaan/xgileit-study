package com.mfs.tnmmwi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Extending SpringBootServletInitializer in order to support WAR file deployment in this project.
 */

@SpringBootApplication
public class TnmMalawiApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TnmMalawiApplication.class);
    }

    public static void main(String[] args)
    {
        SpringApplication.run(TnmMalawiApplication.class, args);
    }
}

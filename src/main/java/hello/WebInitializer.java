package hello;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

public class WebInitializer extends SpringBootServletInitializer {
//
	//345435dfsgfdasdfdsfsdgfd
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

}
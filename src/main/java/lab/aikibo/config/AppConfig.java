package lab.aikibo.config;

import lab.aikibo.service.SampleService;
import lab.aikibo.service.SampleServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by tamami on 18/12/16.
 */
@Configuration
public class AppConfig {

    @Bean
    public SampleService getSampleService() {
        return new SampleServiceImpl();
    }

}

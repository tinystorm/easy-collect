package org.meng.easycollect.config;

import org.meng.easycollect.config.properties.rest.RestTemplateProperties;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author meng
 */
@SpringBootConfiguration
public class RestConfiguration {
    @Bean
    public RestTemplate restTemplate(RestTemplateProperties restTemplateProperties) {
        //可以自定义其他复杂的工厂
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setReadTimeout(restTemplateProperties.getReadTimeout());
        factory.setConnectTimeout(restTemplateProperties.getConnectTimeout());
        return new RestTemplate(factory);
    }
}

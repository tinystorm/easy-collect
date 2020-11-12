package org.meng.easycollect.config.properties.rest;

import lombok.Data;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author meng
 */
@Data
@Component
@PropertySource("classpath:rest-template.properties")
public class RestTemplateProperties {
    private int readTimeout;
    private int connectTimeout;
}

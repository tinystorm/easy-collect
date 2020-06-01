package org.meng.easycollect.common.generator;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;
import org.meng.easycollect.common.CommonChar;

import java.io.Serializable;
import java.util.Properties;
import java.util.UUID;

/**
 * 特殊id生成器
 *
 * @author Meng
 */
public class SpecificIdGenerator implements Configurable, IdentifierGenerator {

    private String prefix;


    @Override
    public void configure(Type type, Properties properties, ServiceRegistry serviceRegistry) throws MappingException {
        this.prefix = properties.getProperty("prefix");
    }

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        return String.format("%s%s", prefix, UUID.randomUUID().toString().replace(CommonChar.HYPHEN, CommonChar.BLANK));
    }


}

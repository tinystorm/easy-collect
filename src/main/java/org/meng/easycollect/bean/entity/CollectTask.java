package org.meng.easycollect.bean.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author Meng
 * @date 2020/06/01
 */
@Data
@Entity
@Table(name = "collect_task")
public class CollectTask {

    @Id
    @GeneratedValue(generator = "specific")
    @GenericGenerator(name = "specific", strategy = "org.meng.easycollect.common.generator.SpecificIdGenerator")
    @Column(name = "id", length = 36)
    private String id;

    @Column(name = "create_user", length = 36)
    private String createUser;


}

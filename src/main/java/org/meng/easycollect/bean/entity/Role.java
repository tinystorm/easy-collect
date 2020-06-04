package org.meng.easycollect.bean.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author Meng
 */
@Table(name = "role")
@Entity
@Data
public class Role {
    @Id
    @Column(name = "id",length = 36)
    @GeneratedValue(generator = "jpa-uuid")
    @GenericGenerator(name = "jpa-uuid", strategy = "uuid")
    private String id;

    @Column(name = "role_name",length = 36)
    private String roleName;

}

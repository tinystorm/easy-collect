package org.meng.easycollect.bean.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author Meng
 */
@Entity
@Table(name = "user")
@Data
public class UserInfo {
    @Id
    @Column(name = "id",length = 36)
    @GeneratedValue(generator = "jpa-uuid")
    @GenericGenerator(name = "jpa-uuid", strategy = "uuid")
    private String id;
    @Column(name = "username",length = 36)
    private String username;
    @Column(name = "password",length = 36)
    private String password;

}

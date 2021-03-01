package com.geely.seckill.usertest.pojo;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author qishun
 * @since 2021-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Usertest implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Integer age;


}

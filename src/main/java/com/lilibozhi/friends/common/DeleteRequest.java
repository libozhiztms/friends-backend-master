package com.lilibozhi.friends.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用删除请求
 *
 * @author lilibozhi
 */
@Data
public class DeleteRequest implements Serializable {

    private static final long serialVersionUID = 1369321778427011388L;

    private long id;
}
package com.lilibozhi.friends.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用分页请求参数
 *
 * @author lilibozhi
 */
@Data
public class PageRequest implements Serializable {

    private static final long serialVersionUID = 8271903209221389502L;
    /**
     * 页面大小
     */
    protected int pageSize = 10;

    /**
     * 当前是第几页
     */
    protected int pageNum = 1;

}
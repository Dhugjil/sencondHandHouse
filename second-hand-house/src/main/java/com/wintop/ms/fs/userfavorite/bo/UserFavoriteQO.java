/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */
package com.wintop.ms.fs.userfavorite.bo;

import java.util.Date;

import com.wintop.ms.common.base.PageQO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This class corresponds to the database table user_favorite
 *
 * @mbg.generated 2018-03-04 15:07:04
 */
@SuppressWarnings("serial")
@Data
@EqualsAndHashCode(callSuper = false)
public class UserFavoriteQO extends PageQO {
    /**
     * 关注ID
     *
     * @mbg.generated 2018-03-04 15:07:04
     */
    private Integer favoriteId;

    /**
     * 关注房屋ID
     *
     * @mbg.generated 2018-03-04 15:07:04
     */
    private Integer houseId;

    /**
     * 关注房屋名称
     *
     * @mbg.generated 2018-03-04 15:07:04
     */
    private String houseName;

    /**
     * 关注人
     *
     * @mbg.generated 2018-03-04 15:07:04
     */
    private Integer userId;

    /**
     * 关注人名称
     *
     * @mbg.generated 2018-03-04 15:07:04
     */
    private String userName;

    /**
     * 状态：关注，取消
     *
     * @mbg.generated 2018-03-04 15:07:04
     */
    private String state;

    /**
     * 关注时间
     *
     * @mbg.generated 2018-03-04 15:07:04
     */
    private Date createTime;

}
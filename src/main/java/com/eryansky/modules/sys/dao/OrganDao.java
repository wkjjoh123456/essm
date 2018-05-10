/**
*  Copyright (c) 2012-2018 http://www.eryansky.com
*
*  Licensed under the Apache License, Version 2.0 (the "License");
*/
package com.eryansky.modules.sys.dao;

import com.eryansky.common.orm.hibernate.Parameter;
import com.eryansky.common.orm.mybatis.MyBatisDao;

import com.eryansky.core.orm.mybatis.dao.TreeDao;
import com.eryansky.modules.sys.mapper.Organ;

import java.util.List;

/**
 * 机构表
 * @author 尔演&Eryan eryanwcp@gmail.com
 * @date 2018-05-08
 */
@MyBatisDao
public interface OrganDao extends TreeDao<Organ> {

    List<Organ> findCustomQuery(Parameter parameter);

    List<Organ> findOwnAndChild(Parameter parameter);

    List<String> findOwnAndChildIds(Parameter parameter);

    List<Organ> findOwnAndChilds(Parameter parameter);

    List<String> findOwnAndChildsIds(Parameter parameter);

    List<Organ> findChild(Parameter parameter);

    List<Organ> findChilds(Parameter parameter);

    List<String> findChildsIds(Parameter parameter);

    List<Organ> findOrgansByIds(Parameter parameter);

    List<String> findOrganUserIds(Parameter parameter);

    /**
     * 查找用户所属机构
     * @param parameter userId：用户ID
     * @return
     */
    List<Organ> findOrgansByUserId(Parameter parameter);

    /**
     * 查找用户所属机构IDS
     * @param parameter userId：用户ID
     * @return
     */
    List<String> findOrganIdsByUserId(Parameter parameter);


    List<Organ> findAssociationOrgansByPostId(Parameter parameter);

    List<String> findAssociationOrganIdsByPostId(Parameter parameter);


    Integer getMaxSort();

    Organ getByCode(Parameter parameter);


    Organ getBySysCode(Parameter parameter);

}
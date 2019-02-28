package com.study.mobile_study.mapper;

import com.study.mobile_study.entity.ProfessionKey;

public interface ProfessionMapper {
    int deleteByPrimaryKey(ProfessionKey key);

    int insert(ProfessionKey record);

    int insertSelective(ProfessionKey record);
}
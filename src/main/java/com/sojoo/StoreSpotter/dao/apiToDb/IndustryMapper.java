package com.sojoo.StoreSpotter.dao.apiToDb;

import com.sojoo.StoreSpotter.dto.apiToDb.Industry;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IndustryMapper {
    List<Industry> selectIndustry() throws Exception;
}
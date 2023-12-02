package com.azhe.tagster.mapper;

import com.azhe.tagster.pojo.dao.label.ProjectAllocationDao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LabelingProjectMapper extends BaseMapper<ProjectAllocationDao> {
}

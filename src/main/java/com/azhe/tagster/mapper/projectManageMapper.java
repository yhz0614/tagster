package com.azhe.tagster.mapper;


import com.azhe.tagster.pojo.dao.business.businessProjectManageDao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface projectManageMapper  extends BaseMapper<businessProjectManageDao> {
    //根据项目id文件id获取文件内容
     String selectContentByPandF (@Param("projectId") Integer project_id, @Param("fileName") String fileName);
}

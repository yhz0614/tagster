package com.azhe.tagster.mapper;

import com.azhe.tagster.pojo.dao.textProject.TextProjectContentDao;
import com.azhe.tagster.pojo.vo.FilesContentVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
@Mapper
public interface FolderManageMapper extends BaseMapper<TextProjectContentDao> {

    List<FilesContentVo> selectContentList(@Param("projectId") Integer project_id, @Param("folderName") String folderName);
}

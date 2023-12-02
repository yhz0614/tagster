package com.azhe.tagster.service.projectLabeling;

import com.azhe.tagster.mapper.LabelingProjectMapper;
import com.azhe.tagster.pojo.dao.label.ProjectAllocationDao;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: azhe
 * @description: 项目标注service
 * @date: 2023/12/2 16:01
 */
@Service
@Validated
public class LabelingProjectServiceImpl implements LabelingProjectService {
    @Resource
    LabelingProjectMapper labelingProjectMapper;

    @Override
    public List<ProjectAllocationDao> selectListByLabelId(Integer labelId) {
        QueryWrapper<ProjectAllocationDao> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("label_id",labelId);
        return labelingProjectMapper.selectList(queryWrapper);
    }
}

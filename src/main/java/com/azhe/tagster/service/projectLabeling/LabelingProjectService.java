package com.azhe.tagster.service.projectLabeling;

import com.azhe.tagster.pojo.dao.label.ProjectAllocationDao;

import java.util.List;

public interface LabelingProjectService {
    List<ProjectAllocationDao> selectListByLabelId(Integer labelId);
}

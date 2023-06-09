package com.tracejp.starnight.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tracejp.starnight.entity.ExamPaperEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author traceJP
 * @since 2023-05-20 22:16:50
 */
@Mapper
public interface ExamPaperDao extends BaseMapper<ExamPaperEntity> {

    List<ExamPaperEntity> listPage(ExamPaperEntity examPaper);

    List<ExamPaperEntity> listTaskExamPaperPage(ExamPaperEntity examPaper);

    void updateTaskByIds(@Param("taskId") Long taskId, @Param("ids") List<Long> ids);

}

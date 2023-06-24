package com.tracejp.starnight.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tracejp.starnight.entity.ExamPaperAnswerEntity;
import com.tracejp.starnight.entity.ExamPaperEntity;
import com.tracejp.starnight.entity.TaskExamAnswerEntity;

import java.util.List;

/**
 * @author traceJP
 * @since 2023-05-20 23:19:38
 */
public interface TaskExamAnswerService extends IService<TaskExamAnswerEntity> {

    /**
     * 通过用户 id 获取任务考试答案列表
     */
    List<TaskExamAnswerEntity> listByUserId(Long userId);

    /**
     * 通过用户id、任务ids 获取任务考试答案列表
     */
    List<TaskExamAnswerEntity> listByUserIdTaskIds(Long userId, List<Long> taskIds);

    /**
     * 保存 通过试卷和答卷
     */
    void saveByPaperAnswer(ExamPaperEntity examPaper, ExamPaperAnswerEntity examPaperAnswerEntity);

}


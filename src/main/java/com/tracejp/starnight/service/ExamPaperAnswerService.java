package com.tracejp.starnight.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tracejp.starnight.entity.ExamPaperAnswerEntity;
import com.tracejp.starnight.entity.UserEntity;
import com.tracejp.starnight.entity.bo.ExamPaperAnswerBo;
import com.tracejp.starnight.entity.vo.student.ExamPaperAnswerSubmitVo;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * @author traceJP
 * @since 2023-05-20 23:19:38
 */
public interface ExamPaperAnswerService extends IService<ExamPaperAnswerEntity> {

    /**
     * 列表
     */
    List<ExamPaperAnswerEntity> listPage(ExamPaperAnswerEntity examPaperAnswer);

    /**
     * 构造 ExamPaperAnswerBo 业务模型
     */
    ExamPaperAnswerBo buildExamPaperBo(ExamPaperAnswerSubmitVo answerVo, UserEntity user);

    /**
     * 是否存在答案 通过 试卷id 用户id 查找
     */
    boolean hasAnswerByPaperIdUserId(Long paperId, Long userId);

    /**
     * 保存答案
     */
    CompletableFuture<Void> saveAnswerBoAsync(ExamPaperAnswerBo examPaperAnswerBo);

}


package com.whimsyquester.entity.po;

import java.io.Serializable;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.po
 * @ClassName: AppExamQuestion
 * @Datetime: 2023/11/20 02:31
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示考试问题的信息
 */

public class AppExamQuestion implements Serializable {


    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 考试ID
     */
    private Integer examId;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 问题ID
     */
    private Integer questionId;

    /**
     * 用户答案
     */
    private String userAnswer;

    /**
     * 0:未作答 1:正确  2:错误
     */
    private Integer answerResult;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExamId() {
        return this.examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getQuestionId() {
        return this.questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getUserAnswer() {
        return this.userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public Integer getAnswerResult() {
        return this.answerResult;
    }

    public void setAnswerResult(Integer answerResult) {
        this.answerResult = answerResult;
    }

    @Override
    public String toString() {
        return "自增ID:" + (id == null ? "空" : id) + "，考试ID:" + (examId == null ? "空" : examId) + "，用户ID:" + (userId == null ? "空" : userId) + "，问题ID:" + (questionId == null ? "空" : questionId) + "，用户答案:" + (userAnswer == null ? "空" : userAnswer) + "，0:错误 1:正确:" + (answerResult == null ? "空" : answerResult);
    }
}


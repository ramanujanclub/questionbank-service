package com.rc.questionbankservice.dao.impl;

import com.rc.questionbankservice.dao.QuestionBankDao;
import com.rc.questionbankservice.entity.QuestionBankEntity;
import com.rc.questionbankservice.repository.QuestionBankRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class QuestionBankDaoImpl implements QuestionBankDao {

    private QuestionBankRepository questionBankRepository;

    @Override
    public QuestionBankEntity save(QuestionBankEntity questionBankEntity) {
        log.info("Saving to database");
        return questionBankRepository.save(questionBankEntity);
    }
}
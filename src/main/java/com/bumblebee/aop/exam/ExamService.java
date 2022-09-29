package com.bumblebee.aop.exam;

import com.bumblebee.aop.exam.annotation.Trace;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author bumblebee
 */
@Service
@RequiredArgsConstructor
public class ExamService {

    private final ExamRepository examRepository;

    @Trace
    public void request(String itemId) {
        examRepository.save(itemId);
    }

}

package com.bumblebee.aop.exam;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author bumblebee
 */
@Service
@RequiredArgsConstructor
public class ExamService {

    private final ExamRepository examRepository;

    public void request(String itemId) {
        examRepository.save(itemId);
    }

}

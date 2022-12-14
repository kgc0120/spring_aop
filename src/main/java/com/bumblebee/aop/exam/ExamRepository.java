package com.bumblebee.aop.exam;

import com.bumblebee.aop.exam.annotation.Retry;
import com.bumblebee.aop.exam.annotation.Trace;
import org.springframework.stereotype.Repository;

/**
 * @author bumblebee
 */
@Repository
public class ExamRepository {


    private static int seq = 0;

    /*
    * 5번에 1번 실패하는 요청
    * */
    @Trace
    @Retry(value = 10)
    public String save(String itmeId) {
        seq++;
        System.out.println(seq +", " + seq%5);
        if(seq % 5 == 0) {
            throw new IllegalStateException("예외 발생");
        }
        return "ok";
    }

}

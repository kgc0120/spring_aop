package com.bumblebee.aop.internalcall;

import com.bumblebee.aop.internalcall.aop.CallLogAspect;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author bumblebee
 */
@Slf4j
@Import(CallLogAspect.class)
@SpringBootTest
class CallServiceVOTest {

    @Autowired
    CallServiceVO callServiceVO;

    @Test
    void external() {
        // 내부 메소드 internal은 프록시 객체가 아닌 타켓의 this 메소드라서 aop 적용이 안된다.
        callServiceVO.external();
    }

    @Test
    void internal() {
        callServiceVO.internal();
    }
}
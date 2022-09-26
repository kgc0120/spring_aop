package com.bumblebee.aop.member;

import com.bumblebee.aop.member.annotation.ClassAop;
import com.bumblebee.aop.member.annotation.MethodAop;
import org.springframework.stereotype.Component;

/**
 * @author bumblebee
 */
@ClassAop
@Component
public class MemberServiceImpl implements MemberService{
    @Override
    @MethodAop("test value")
    public String hello(String param) {
        return "ok";
    }

    public String internal(String param) {
        return "ok";
    }


}


package com.lilibozhi.friends.service;

import com.lilibozhi.friends.model.domain.User;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

@SpringBootTest
public class RedisTest {

    @Resource
    private RedisTemplate redisTemplate;

    @Test
    void test() {
        ValueOperations valueOperations = redisTemplate.opsForValue();

        valueOperations.set("libozhiString", "liqin");
        valueOperations.set("libozhiInt", 1);
        valueOperations.set("libozhiDouble", 2.0);
        User user = new User();
        user.setId(1L);
        user.setUsername("liqinqin");
        valueOperations.set("libozhiUser", user);

        Object libozhi = valueOperations.get("libozhiString");
        Assertions.assertTrue("liqin".equals((String) libozhi));

        libozhi = valueOperations.get("libozhiInt");
        Assertions.assertTrue(1 == ((Integer) libozhi));

        libozhi = valueOperations.get("libozhiDouble");
        Assertions.assertTrue(2.0 == ((Double) libozhi));

        System.out.println(valueOperations.get("libozhiUser"));
    }

}

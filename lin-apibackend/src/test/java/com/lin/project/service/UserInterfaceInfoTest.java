package com.lin.project.service;/**
 * @author 廖涛涛
 * @version 1.0
 * @date now()
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @description TODO
 * @author 鏋楀窛鎴�
 * @date 2023/4/18 21:41
 * @version 1.0
 */
@SpringBootTest
public class UserInterfaceInfoTest {

    @Autowired
    private UserInterfaceInfoService userInterfaceInfoService;

    @Test
    void test(){
        boolean b = userInterfaceInfoService.invokeCount(1L, 1L);
//        Assertions.assertEquals(true,b);
        System.out.println(b);
    }

}

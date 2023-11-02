package com.example.bizsurveydomainpr.domain.user;

import com.example.bizsurveydomainpr.constant.Gender;
import com.example.bizsurveydomainpr.constant.Plan;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@Slf4j
class UserEntityRepositoryTest {

    @Autowired
    private UserEntityRepository userEntityRepository;

    @Test
    public void insertTest(){


        User user = User.builder()
                .email("1244332")
                .name("4342")
                .nickname("323442")
                .gender(Gender.FEMALE)
                .birthdate("34234")
                .planSubscribe(Plan.NORMAL_SUBSCRIBE)
                .build();

        User no = userEntityRepository.save(user);

        System.out.println(no);

        log.info("no = {}", no);


    }

}
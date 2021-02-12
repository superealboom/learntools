package com.afuo.learntools.controller;


import com.afuo.learntools.pojo.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
@Slf4j
public class PersonController {

    /**
     * 测试对象
     * @return
     */
    @RequestMapping("getPerson")
    public Person person() {
        Person person = Person.builder().id(1).username("wanger").password("123456").build();

        log.debug("");
        log.info("");
        log.warn("");
        log.error("");

        return person;
    }

}

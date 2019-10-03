package com.minichn.feign.impl;

import com.minichn.entity.Student;
import com.minichn.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by minichn on 2019/8/19 0019.
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中......";
    }
}

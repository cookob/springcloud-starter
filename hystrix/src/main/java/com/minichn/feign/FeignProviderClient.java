package com.minichn.feign;

import com.minichn.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * Created by minichn on 2019/8/19 0019.
 */
@FeignClient(value = "provider")
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}

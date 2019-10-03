package com.minichn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by minichn on 2019/8/18 0018.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private long id;
    private String name;
    private int age;
}

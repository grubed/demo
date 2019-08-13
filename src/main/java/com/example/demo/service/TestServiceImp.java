package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Test;
import com.example.demo.mapper.TestMapper;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImp extends ServiceImpl<TestMapper, Test> implements TestService {

    public void a() {
        Test test = new Test();
        test.setS(1);
        this.save(test);
    }
}

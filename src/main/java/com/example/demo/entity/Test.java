package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Test {
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;
    private int s;
}

package com.czeta.onlinejudge.model.param;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName MachineProblemModel
 * @Description
 * @Author chenlongjie
 * @Date 2020/3/12 19:52
 * @Version 1.0
 */
@Data
public class MachineProblemModel {
    private Long id;

    private String title;
    private String description;
    private String inputDescription;
    private String outputDescription;
    private String inputSamples;
    private String outputSamples;
    private String hint;
    private String sourceName;
    private Integer timeLimit;
    private Integer memoryLimit;
    private String ioMode;
    private String level;
    private String language;
    private Short status;

    private Integer judgeTypeId;
    private Integer problemType;
    private Integer spj;

    private List<Integer> tagId;
}

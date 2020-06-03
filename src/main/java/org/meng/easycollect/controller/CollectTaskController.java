package org.meng.easycollect.controller;

import org.meng.easycollect.bean.entity.CollectTask;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Meng
 * @date 2020/06/03
 */
@RestController
public class CollectTaskController {

    @PostMapping
    public CollectTask listCollectTask() {

        return new CollectTask();
    }

}

package org.meng.easycollect.controller;

import org.meng.easycollect.bean.entity.CollectTask;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Meng
 * @date 2020/06/03
 */
@RestController(value = "/task")
public class CollectTaskController {

    @RequestMapping(value = "/list")
    public CollectTask listCollectTask() {
        return new CollectTask();
    }

}

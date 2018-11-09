package com.niezhiliang.shiro.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.niezhiliang.shiro.demo.annotation.Log;
import com.niezhiliang.shiro.demo.service.DeptService;
import com.niezhiliang.shiro.demo.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @Date 2018/11/8 下午2:47
 */
@RequestMapping(value = "dept")
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "add")
    @Log(value = "添加部门")
    public String add(@RequestBody JSONObject requestJson) {
        CommonUtils.hasAllRequired(requestJson,"deptName");
        return deptService.addDept(requestJson);
    }

    @RequestMapping(value = "delete")
    @Log(value = "删除部门")
    public String delete(@RequestBody JSONObject requestJson) {
        CommonUtils.hasAllRequired(requestJson,"id");
        return deptService.deleteDept(requestJson);
    }

    @RequestMapping(value = "update")
    @Log(value = "编辑部门")
    public String update(@RequestBody JSONObject requestJson) {
        CommonUtils.hasAllRequired(requestJson,"id,deptName");
        return deptService.updateDept(requestJson);
    }

    @RequestMapping(value = "query")
    @Log(value = "查询部门列表")
    public String query(@RequestBody JSONObject requestJson) {
        return deptService.selectDept(requestJson);
    }
}

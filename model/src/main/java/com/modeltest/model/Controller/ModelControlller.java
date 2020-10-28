package com.modeltest.model.Controller;

import com.modeltest.model.entity.easypoi;
import com.modeltest.model.util.ExcelUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ModelControlller {

    @GetMapping("/")
    public String index() {
        return "model-htm";
    }

    @PostMapping("/connect")
    public String connect(String username, Model model){
        String rs="提交失败，用户名不能为空";
        if (StringUtils.isNotBlank(username)){
            rs="提交成功！";
            model.addAttribute("rs",rs);
            return "model-in";
        }
        model.addAttribute("rs",rs);
        return "model-htm";
    }


    @RequestMapping(value = "/export", method = RequestMethod.GET)
    public void exportExcel(HttpServletResponse response) throws IOException {
        long start = System.currentTimeMillis();
        List<easypoi> personList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            easypoi personVo = new easypoi();
            personVo.setName("张三" + i);
            personVo.setDate1("张三Date1-" + i);
            personVo.setDate2("张三Date2-" + i);
            personVo.setDate2("张三Date3-" + i);
            personList.add(personVo);
        }
        System.out.println(("导出excel所花时间：" + (System.currentTimeMillis() - start)));
        ExcelUtils.exportExcel(personList, "员工信息表", "员工信息", easypoi.class, "员工信息", response);
    }
}

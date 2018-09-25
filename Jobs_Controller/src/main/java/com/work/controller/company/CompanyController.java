package com.work.controller.company;

import com.work.common.vo.R;
import com.work.domain.user.Company;
import com.work.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName CompanyController
 * @Description //TODO
 * @Author 韩钰琦
 * @Date 2018/09/19 21:42
 * @Version 1.0
 */

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping("/companyInfo.do")
    public R companyInfo(int id) {
        return companyService.queryCompanyInfo(id);
    }
}

package com.work.serviceimpl.company;

import com.work.common.vo.R;
import com.work.domain.user.Company;
import com.work.mapper.user.CompanyMapper;
import com.work.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName CompanyServiceImpl
 * @Description //TODO
 * @Author 韩钰琦
 * @Date 2018/09/19 21:38
 * @Version 1.0
 */

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyMapper companyMapper;
    @Override
    public R queryCompanyInfo(int id) {
        Company company = companyMapper.selectByCompanyId(id);
        if (company != null) {
           return new R(1005,"success",company);
        }
        return new R(1006,"服务器异常");
    }
}

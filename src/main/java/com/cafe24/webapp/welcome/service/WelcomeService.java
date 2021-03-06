package com.cafe24.webapp.welcome.service;

import com.cafe24.webapp.welcome.dao.WelcomeMapper;
import com.cafe24.webapp.welcome.vo.WelcomeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WelcomeService {
    @Autowired
    private WelcomeMapper welcomeMapper;

    public List<WelcomeVO> selectWelcomeList() throws Exception {
        WelcomeVO welcomeVO = new WelcomeVO();
        List<WelcomeVO> WelcomeList = welcomeMapper.selectWelcomeList(welcomeVO);

        for(WelcomeVO vo : WelcomeList) {
            System.out.println("name : " + vo.getName() +  " / team : " + vo.getTeam());
        }
        return WelcomeList;
    }
}

package com.cafe24.webapp.welcome.dao;

import com.cafe24.webapp.welcome.vo.WelcomeVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WelcomeMapper {
    private static final String NAMESPACE = "com.cafe24.webapp.welcome.dao.WelcomeMapper";
    @Autowired
    private SqlSessionTemplate sqlSession;
    public List<WelcomeVO> selectWelcomeList(WelcomeVO vo) throws Exception {
        return sqlSession.selectList(NAMESPACE + ".selectWelcomeList", vo);
    }
}

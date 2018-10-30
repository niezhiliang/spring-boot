package com.niezhiliang.oauth2.pass.pattern.mapper;

import com.niezhiliang.oauth2.pass.pattern.domain.OauthRefreshToken;
import com.niezhiliang.oauth2.pass.pattern.domain.OauthRefreshTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OauthRefreshTokenMapper {
    long countByExample(OauthRefreshTokenExample example);

    int deleteByExample(OauthRefreshTokenExample example);

    int insert(OauthRefreshToken record);

    int insertSelective(OauthRefreshToken record);

    List<OauthRefreshToken> selectByExampleWithBLOBs(OauthRefreshTokenExample example);

    List<OauthRefreshToken> selectByExample(OauthRefreshTokenExample example);

    int updateByExampleSelective(@Param("record") OauthRefreshToken record, @Param("example") OauthRefreshTokenExample example);

    int updateByExampleWithBLOBs(@Param("record") OauthRefreshToken record, @Param("example") OauthRefreshTokenExample example);

    int updateByExample(@Param("record") OauthRefreshToken record, @Param("example") OauthRefreshTokenExample example);
}
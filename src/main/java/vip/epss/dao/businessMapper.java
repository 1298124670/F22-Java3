package vip.epss.dao;

import org.apache.ibatis.annotations.Param;
import vip.epss.domain.business;
import vip.epss.domain.businessExample;

import java.util.List;

public interface businessMapper {
    long countByExample(businessExample example);

    int deleteByExample(businessExample example);

    int deleteByPrimaryKey(Integer businessId);

    int insert(business row);

    int insertSelective(business row);

    List<business> selectByExampleWithBLOBs(businessExample example);

    List<business> selectByExample(businessExample example);

    business selectByPrimaryKey(Integer businessId);

    int updateByExampleSelective(@Param("row") business row, @Param("example") businessExample example);

    int updateByExampleWithBLOBs(@Param("row") business row, @Param("example") businessExample example);

    int updateByExample(@Param("row") business row, @Param("example") businessExample example);

    int updateByPrimaryKeySelective(business row);

    int updateByPrimaryKeyWithBLOBs(business row);

    int updateByPrimaryKey(business row);
}
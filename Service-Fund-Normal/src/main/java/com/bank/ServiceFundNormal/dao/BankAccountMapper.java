package com.bank.ServiceFundNormal.dao;

import com.bank.ServiceFundNormal.pojo.BankAccount;
import com.bank.ServiceFundNormal.pojo.BankAccountExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BankAccountMapper {
    int countByExample(BankAccountExample example);

    int deleteByExample(BankAccountExample example);

    int deleteByPrimaryKey(String account);

    int insert(BankAccount record);

    int insertSelective(BankAccount record);

    List<BankAccount> selectByExample(BankAccountExample example);

    BankAccount selectByPrimaryKey(String account);

    int updateByExampleSelective(@Param("record") BankAccount record, @Param("example") BankAccountExample example);

    int updateByExample(@Param("record") BankAccount record, @Param("example") BankAccountExample example);

    int updateByPrimaryKeySelective(BankAccount record);

    int updateByPrimaryKey(BankAccount record);
}

package com.bank.ServiceRemitNormal.dao;

import com.bank.ServiceRemitNormal.pojo.BankAccount;
import com.bank.ServiceRemitNormal.pojo.BankAccountExample;
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

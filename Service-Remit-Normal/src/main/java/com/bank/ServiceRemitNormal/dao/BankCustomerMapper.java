package com.bank.ServiceRemitNormal.dao;

import com.bank.ServiceRemitNormal.pojo.BankCustomer;
import com.bank.ServiceRemitNormal.pojo.BankCustomerExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BankCustomerMapper {
    int countByExample(BankCustomerExample example);

    int deleteByExample(BankCustomerExample example);

    int deleteByPrimaryKey(String custId);

    int insert(BankCustomer record);

    int insertSelective(BankCustomer record);

    List<BankCustomer> selectByExample(BankCustomerExample example);

    BankCustomer selectByPrimaryKey(String custId);

    int updateByExampleSelective(@Param("record") BankCustomer record, @Param("example") BankCustomerExample example);

    int updateByExample(@Param("record") BankCustomer record, @Param("example") BankCustomerExample example);

    int updateByPrimaryKeySelective(BankCustomer record);

    int updateByPrimaryKey(BankCustomer record);
}
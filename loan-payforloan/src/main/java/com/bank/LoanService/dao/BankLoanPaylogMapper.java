package com.bank.LoanService.dao;

import com.bank.LoanService.pojo.BankLoanPaylog;
import com.bank.LoanService.pojo.BankLoanPaylogExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BankLoanPaylogMapper {
    int countByExample(BankLoanPaylogExample example);

    int deleteByExample(BankLoanPaylogExample example);

    int deleteByPrimaryKey(String paylogId);

    int insert(BankLoanPaylog record);

    int insertSelective(BankLoanPaylog record);

    List<BankLoanPaylog> selectByExample(BankLoanPaylogExample example);

    BankLoanPaylog selectByPrimaryKey(String paylogId);

    int updateByExampleSelective(@Param("record") BankLoanPaylog record, @Param("example") BankLoanPaylogExample example);

    int updateByExample(@Param("record") BankLoanPaylog record, @Param("example") BankLoanPaylogExample example);

    int updateByPrimaryKeySelective(BankLoanPaylog record);

    int updateByPrimaryKey(BankLoanPaylog record);
}
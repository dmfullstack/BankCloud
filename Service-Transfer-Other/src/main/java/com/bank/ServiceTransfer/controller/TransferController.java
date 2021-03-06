package com.bank.ServiceTransfer.controller;

import com.bank.ServiceTransfer.service.TransferService;
import com.bank.ServiceTransfer.utils.BankResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user/transfer")
public class TransferController {
    @Autowired
    private TransferService transferService;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    @ResponseBody
    public BankResult getTransferLogs() {
        BankResult bankResult = transferService.getTransferLogs();

        return bankResult;
    }

    @RequestMapping(value = "/querydetail/{transferId}", method = RequestMethod.GET)
    @ResponseBody
    public BankResult getOneTransferLog(@RequestParam(value = "transferId")String transferId) {
        BankResult bankResult = transferService.getOneTransferLog(transferId);

        return bankResult;
    }
}

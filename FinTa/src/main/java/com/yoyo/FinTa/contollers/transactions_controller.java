package com.yoyo.FinTa.contollers;

import com.yoyo.FinTa.entity.transactions;
import com.yoyo.FinTa.repo.transactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class transactions_controller {

    @Autowired
    transactionsRepository transRepo ;

    @GetMapping("/transactions")
    public Iterable<transactions> getTransactions(){
        return transRepo.findAll();
    }

    @PostMapping("/add-transaction")
    public String addTransaction(@RequestBody transactions t){
        transRepo.save(t);
        return "Success";
    }

    @PutMapping("/update-transaction")
    public String updateTransaction(@RequestBody transactions t){
        transRepo.save(t);
        return "successe";
    }

    @DeleteMapping("/delete-transaction")
    public String deleteTransaction(@RequestParam int Id){
        transRepo.deleteById(Id);
        return "success";
    }

}

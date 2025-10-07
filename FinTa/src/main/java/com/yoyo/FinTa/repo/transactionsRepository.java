package com.yoyo.FinTa.repo;

import com.yoyo.FinTa.entity.transactions;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface transactionsRepository extends CrudRepository<transactions, Integer> {
            List<transactions> findAllbyuid(int uid);
}

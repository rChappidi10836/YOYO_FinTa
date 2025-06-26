package com.yoyo.FinTa.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public int uid;
    public String expense_type;
    public int amount;
    public String description;
    public LocalDateTime date_time;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate_time() {
        return date_time;
    }

    public void setDate_time(LocalDateTime date_time) {
        this.date_time = date_time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpense_type() {
        return expense_type;
    }

    public void setExpense_type(String expense_type) {
        this.expense_type = expense_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}

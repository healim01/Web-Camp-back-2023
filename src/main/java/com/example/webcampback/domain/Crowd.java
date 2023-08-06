package com.example.webcampback.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;
import lombok.Getter;

@Entity
@Getter
public class Crowd {
    @Id
    private Long id;
    private int fundingId;
    private String title;
    private String company;
    @Lob
    private String fund_img;
    private long current_amount;
    private int progress;
    private int backers_count;
    private int goal_amount;
    private String start_date;
    private String end_date;
    private String billing_date;
    private int left_day;
    private int like_num;

}

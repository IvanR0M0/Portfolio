package com.portfolio_irf.portfolio_irf.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String date_start;
    private String date_end;
    private String educ_title;
    private String educ_desc;

    public Education() {
    }

    public Education(int id, String date_start, String date_end, String educ_title, String educ_desc) {
        this.id = id;
        this.date_start = date_start;
        this.date_end = date_end;
        this.educ_title = educ_title;
        this.educ_desc = educ_desc;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDate_start() {
        return date_start;
    }
    public void setDate_start(String date_start) {
        this.date_start = date_start;
    }

    public String getDate_end() {
        return date_end;
    }
    public void setDate_end(String date_end) {
        this.date_end = date_end;
    }

    public String getEduc_title() {
        return educ_title;
    }
    public void setEduc_title(String educ_title) {
        this.educ_title = educ_title;
    }

    public String getEduc_desc() {
        return educ_desc;
    }
    public void setEduc_desc(String educ_desc) {
        this.educ_desc = educ_desc;
    }
}

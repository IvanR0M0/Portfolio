package com.portfolio_irf.portfolio_irf.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LaboralExp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String date_start;
    private String date_end;
    private String job_title;
    private String job_desc;

    public LaboralExp() {
    }

    public LaboralExp(int id, String date_start, String date_end, String job_title, String job_description) {
        this.id = id;
        this.date_start = date_start;
        this.date_end = date_end;
        this.job_title = job_title;
        this.job_desc = job_description;
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

    public String getJob_title() {
        return job_title;
    }
    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getJob_desc() {
        return job_desc;
    }
    public void setJob_desc(String job_description) {
        this.job_desc = job_description;
    }

    @Override
    public String toString() {
        return "LaboralExp{" +
                "id=" + id +
                ", date_start='" + date_start + '\'' +
                ", date_end='" + date_end + '\'' +
                ", job_title='" + job_title + '\'' +
                ", job_description='" + job_desc + '\'' +
                '}';
    }
}

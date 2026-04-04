package com.portfolio_irf.portfolio_irf.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String desc_prj;
    private String link;
    private String ref_photo;

    @ElementCollection
    @CollectionTable(name = "project_technologies", joinColumns = @JoinColumn(name = "project_id"))
    @Column(name = "technology_name")
    private List<String> technologies;

    public Project() {
    }

    public Project(int id, String title, String desc_prj, String link, String ref_photo, List<String> technologies) {
        this.id = id;
        this.title = title;
        this.desc_prj = desc_prj;
        this.link = link;
        this.ref_photo = ref_photo;
        this.technologies = technologies;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc_prj() {
        return desc_prj;
    }
    public void setDesc_prj(String desc) {
        this.desc_prj = desc;
    }

    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }

    public String getRef_photo() {
        return ref_photo;
    }
    public void setRef_photo(String ref_photo) {
        this.ref_photo = ref_photo;
    }

    public List<String> getTechnologies() {
        return technologies;
    }
    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", desc_prj='" + desc_prj + '\'' +
                ", link='" + link + '\'' +
                ", ref_photo='" + ref_photo + '\'' +
                ", technologies=" + technologies +
                '}';
    }
}


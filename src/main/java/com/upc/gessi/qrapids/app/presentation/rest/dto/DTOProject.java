package com.upc.gessi.qrapids.app.presentation.rest.dto;


import java.util.List;

public class DTOProject {
    private Long id;
    private String externalId;
    private String name;
    private String description;
    private byte[] logo;
    private boolean active;
    private String backlogId;
    private String taigaURL;
    private String githubURL;
    private String prtURL;
    private Boolean isGlobal;
    private List<DTOStudent> students;
    
    public DTOProject(){}
    
    public DTOProject(Long id, String externalId, String name, String description, byte[] logo, boolean active, String backlogId, String taigaURL, String githubURL, String prtURL, Boolean isGlobal) {
    	this.id = id;
    	this.externalId = externalId;
    	this.name = name;
    	this.description = description;
    	this.logo = logo;
    	this.active = active;
    	this.backlogId = backlogId;
    	this.taigaURL = taigaURL;
    	this.githubURL = githubURL;
        this.prtURL = prtURL;
    	this.isGlobal=isGlobal;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setexternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }
    
    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getBacklogId() {
        return backlogId;
    }

    public void setBacklogId(String backlogId) {
        this.backlogId = backlogId;
    }

    public String getTaigaURL() {return taigaURL;}

    public void setTaigaURL(String taigaURL) {this.taigaURL=taigaURL;}

    public String getGithubURL() {return githubURL;}

    public void setGithubURL(String githubURL) {this.githubURL=githubURL;}

    public String getPrtURL() {return prtURL;}

    public void setPrtURL(String prtURL) {this.prtURL=prtURL;}

    public Boolean getIsGlobal() { return isGlobal;}

    public void setIsGlobal(Boolean global) { isGlobal = global;}

    public List<DTOStudent> getStudents() { return students; }

    public void setStudents(List<DTOStudent> students) {this.students=students;}
}

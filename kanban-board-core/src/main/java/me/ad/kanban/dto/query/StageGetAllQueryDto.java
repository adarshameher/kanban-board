package me.ad.kanban.dto.query;

import java.util.List;

public class StageGetAllQueryDto {
    private String id;
    private List<String> idIn;
    private String name;
    private List<String> nameIn;
    private String nameLike;
    private String sortBy;
    private String sortOrder;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getIdIn() {
        return idIn;
    }

    public void setIdIn(List<String> idIn) {
        this.idIn = idIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNameIn() {
        return nameIn;
    }

    public void setNameIn(List<String> nameIn) {
        this.nameIn = nameIn;
    }

    public String getNameLike() {
        return nameLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }
}

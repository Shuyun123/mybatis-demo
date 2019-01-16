package net.anumbrella.mybatis.entity;

import java.io.Serializable;

/**
 * @author Anumbrella
 */
public class Role implements Serializable{

    private Long id;

    private String role;

    private Integer enabled;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}

package net.anumbrella.mybatis.entity;

/**
 * @author Anumbrella
 */
public class User {


    private Long id;

    private String username;

    private String password;

    private Integer expried;

    private Integer disabled;

    private String email;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getExpried() {
        return expried;
    }

    public void setExpried(Integer expried) {
        this.expried = expried;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

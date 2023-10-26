package ch.zli.m223.model;

import java.util.*;

import javax.persistence.*;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class ApplicationUser {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Schema(readOnly = true)
  private Long id;

  @Column
  private String Username;

  @Column
  private String Password;

  @OneToMany(mappedBy="applicationUser")
  @JsonIgnoreProperties("applicationUser")
  @Fetch(FetchMode.JOIN)
  private List<Entry> entries;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return Username;
  }

  public void setUsername(String username) {
    Username = username;
  }

  public String getPassword() {
    return Password;
  }

  public void setPassword(String password) {
    Password = password;
  }
}

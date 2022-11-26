package com.example.demo2.model.entity;


import lombok.*;
import org.springframework.data.annotation.CreatedBy;

import javax.persistence.*;
import javax.swing.*;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
public class Groups extends BaseEntity{

   // @Column(unique = true)
  //  private  int userCreateId;
    @Column(unique = true,nullable = false)
    private String name;
    private Boolean editFilesAll;
    private Boolean addUserAll;
    private Boolean editGroupAll;
    @Column(nullable = false)
    private String typeGroup;

    @CreatedBy
    @ManyToOne(targetEntity = User.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_create_id",referencedColumnName = "id",nullable = false,updatable = false)
    private  User user;

 public Groups fromMap(Map<String,?> map){
  return Groups.builder()
          .name((String) map.get("name"))
          .editFilesAll((Boolean) map.get("editFilesAll"))
          .addUserAll((Boolean) map.get("addUserAll"))
          .editGroupAll((Boolean) map.get("editGroupAll"))
          .typeGroup((String) map.get("typeGroup"))
          .build();
 }
    //@OneToMany (targetEntity = File.class,cascade = CascadeType.ALL)
    //@JoinColumn(name = "files_group_id",referencedColumnName = "id",nullable = false)
   // private List<File> files;

   // @OneToMany (targetEntity = GroupUser.class,cascade = CascadeType.ALL)
   // @JoinColumn(name = "group_id",referencedColumnName = "id",nullable = false)
    //private List<GroupUser> groupUsers;

   // @ManyToMany(mappedBy = "groupsSet")
    //private Set<User> userSet =new HashSet<>();
}
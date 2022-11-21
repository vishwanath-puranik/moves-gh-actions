package com.ibm.service.login.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

//    Collection<User> findAllUser(String uuid);
    @Query(nativeQuery=true,value="SELECT * FROM users WHERE username=?1 LIMIT 1")
    User findUserByUserName(String username);
    @Query(nativeQuery=true,value="SELECT * FROM users WHERE username=?1 AND password=?2 LIMIT 1")
    User findUserByUserNamePassword(String username,String password);
//     void addUser(User user);
//     void updateUser(User user);
//     void deleteUser(User user);

}

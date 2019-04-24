package springmvc.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import springmvc.entity.User;

import java.util.List;

@Repository("UserDao")
public interface UserDao {

    public User findByUsernameAndPwd(@Param("username") String username, @Param("password") String password);

    public List<User> find(User User);

    public void add(User User);

    public void update(User User);

    public void delete(String id);

}

package com.src.main.dao.interfaces.users;

import com.src.main.dao.interfaces.BaseDao;
import com.src.main.domains.users.User;
import com.src.main.searchfilter.users.UserSearchFilter;

/**
 * Created by mj on 22/5/16.
 */

public interface UserDao extends BaseDao<User, UserSearchFilter> {
    User getUserByNameAndPassword(String userName, String password);
}

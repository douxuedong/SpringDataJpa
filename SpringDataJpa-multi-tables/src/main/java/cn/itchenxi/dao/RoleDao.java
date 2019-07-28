package cn.itchenxi.dao;

import cn.itchenxi.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RoleDao extends JpaRepository<Role,Long> ,
        JpaSpecificationExecutor<Role> {
}

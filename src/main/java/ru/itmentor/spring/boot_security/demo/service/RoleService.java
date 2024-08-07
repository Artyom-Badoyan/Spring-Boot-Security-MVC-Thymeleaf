package ru.itmentor.spring.boot_security.demo.service;

import ru.itmentor.spring.boot_security.demo.entity.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {

    List<Role> getListRoles();

    Set<Role> getRolesByIds(List<Long> roleIds);
}

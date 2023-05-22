package com.jk.Mapper;

import com.jk.Pojo.ClassTable;

import java.util.List;

@Mapper
public interface ClassMapper {
    /**
     *
     * @return
     */
    List<ClassTable> findClassList(ClassTable classTable);

    /**
     * 添加班级信息
     * @param classTable 班级信息
     * @return 添加结果
     */
    Integer insert(ClassTable classTable);

    /**
     * 删除班级信息
     * @param id 班级编号
     * @return 删除结果
     */
    Integer delete(int id);

    /**
     * 修改班级信息
     * @param classTable 班级信息
     * @return 修改结果
     */
    Integer update(ClassTable classTable);

}

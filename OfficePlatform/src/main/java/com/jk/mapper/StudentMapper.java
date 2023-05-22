package com.jk.mapper;

import com.jk.Pojo.StudentList;

import java.util.List;

public interface StudentMapper {
    /**
     * 查询所有学生
     * @return 学生列表
     */
    List<StudentList> findAll();

    /**
     * 添加学生信息
     * @return 添加结果
     */
    Integer sinsert(StudentList studentList);

    /**
     * 删除学生信息
     * @return 删除结果
     */
    Integer sdelete(int snumber);

    /**
     * 修改学生信息
     * @return 修改结果
     */
    Integer supdate(StudentList studentList);
}

package com.jk.mapper;

import com.jk.Pojo.TeacherList;

import java.util.List;

public interface TeacherMapper {
    /**
     * 查询所有教师信息
     * @return 教师列表
     */
    public List<TeacherList> tfindAll();

    /**
     * 删除教师信息
     * @param tnumber 教师编号
     * @return 删除结果
     */
    public Integer tdelete(int tnumber);

    /**
     * 修改教师信息
     * @param teacherList 教师信息
     * @return 修改结果
     */
    public Integer tupdate(TeacherList teacherList);

    /**
     * 添加教师信息
     * @param teacherList 教师信息
     * @return 添加结果
     */
    public Integer tfindAdd(TeacherList teacherList);

    /**
     * 模糊查询教师信息
     * @param tnumber 教师编号
     * @param tname 教师姓名
     * @param tmajor 教师专业
     * @return 教师列表
     */
    public List<TeacherList> tmohu(@Param("tnumber") int tnumber,@Param("tname") String tname,@Param("tmajor") String tmajor);
}

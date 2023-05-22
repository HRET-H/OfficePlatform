package com.jk.mapper;
import com.jk.pojo.ExaminationForm;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ExaminationMapper {
    /**
     * 查询所有班级信息
     * @return 班级列表
     */
    List<ExaminationForm> findAll();

    /**
     * 添加班级信息
     * @param examinationForm 班级信息
     * @return 添加结果
     */
    Integer insert(ExaminationForm examinationForm);

    /**
     * 删除班级信息
     * @param number 班级编号
     * @return 删除结果
     */
    Integer delete(int number);

    /**
     * 修改班级信息
     * @param examinationForm 班级信息
     * @return 修改结果
     */
    Integer update(ExaminationForm examinationForm);
}

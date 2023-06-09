package hut.tyt.mapper;

import hut.tyt.pojo.Position;
import hut.tyt.pojo.PositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PositionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    long countByExample(PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    int deleteByExample(PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    int insert(Position record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    int insertSelective(Position record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    List<Position> selectByExample(PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    Position selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    int updateByExampleSelective(@Param("record") Position record, @Param("example") PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    int updateByExample(@Param("record") Position record, @Param("example") PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    int updateByPrimaryKeySelective(Position record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    int updateByPrimaryKey(Position record);
}
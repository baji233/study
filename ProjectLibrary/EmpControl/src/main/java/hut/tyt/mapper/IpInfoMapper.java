package hut.tyt.mapper;

import hut.tyt.pojo.IpInfo;
import hut.tyt.pojo.IpInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IpInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplink
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    long countByExample(IpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplink
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    int deleteByExample(IpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplink
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplink
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    int insert(IpInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplink
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    int insertSelective(IpInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplink
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    List<IpInfo> selectByExample(IpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplink
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    IpInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplink
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    int updateByExampleSelective(@Param("record") IpInfo record, @Param("example") IpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplink
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    int updateByExample(@Param("record") IpInfo record, @Param("example") IpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplink
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    int updateByPrimaryKeySelective(IpInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iplink
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    int updateByPrimaryKey(IpInfo record);
}
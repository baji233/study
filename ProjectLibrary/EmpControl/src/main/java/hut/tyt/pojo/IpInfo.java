package hut.tyt.pojo;

public class IpInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iplink.id
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iplink.emp_id
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    private Integer empId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iplink.ip
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    private String ip;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iplink.id
     *
     * @return the value of iplink.id
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iplink.id
     *
     * @param id the value for iplink.id
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iplink.emp_id
     *
     * @return the value of iplink.emp_id
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iplink.emp_id
     *
     * @param empId the value for iplink.emp_id
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iplink.ip
     *
     * @return the value of iplink.ip
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iplink.ip
     *
     * @param ip the value for iplink.ip
     *
     * @mbg.generated Mon Aug 01 23:09:08 CST 2022
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}
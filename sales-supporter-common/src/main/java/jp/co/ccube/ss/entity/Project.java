package jp.co.ccube.ss.entity;

public class Project {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.project_id
     *
     * @mbggenerated Mon Aug 27 15:02:39 JST 2018
     */
    private Integer projectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.project_name
     *
     * @mbggenerated Mon Aug 27 15:02:39 JST 2018
     */
    private String projectName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.client_id
     *
     * @mbggenerated Mon Aug 27 15:02:39 JST 2018
     */
    private Integer clientId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.project_id
     *
     * @return the value of project.project_id
     *
     * @mbggenerated Mon Aug 27 15:02:39 JST 2018
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.project_id
     *
     * @param projectId the value for project.project_id
     *
     * @mbggenerated Mon Aug 27 15:02:39 JST 2018
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.project_name
     *
     * @return the value of project.project_name
     *
     * @mbggenerated Mon Aug 27 15:02:39 JST 2018
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.project_name
     *
     * @param projectName the value for project.project_name
     *
     * @mbggenerated Mon Aug 27 15:02:39 JST 2018
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.client_id
     *
     * @return the value of project.client_id
     *
     * @mbggenerated Mon Aug 27 15:02:39 JST 2018
     */
    public Integer getClientId() {
        return clientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.client_id
     *
     * @param clientId the value for project.client_id
     *
     * @mbggenerated Mon Aug 27 15:02:39 JST 2018
     */
    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }
}
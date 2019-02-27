package com.strawbingo.eight.model;

import java.util.Date;

public class SnapshotMetadata {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_snapshot_metadata.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_snapshot_metadata.streamId
     *
     * @mbg.generated
     */
    private String streamId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_snapshot_metadata.taskType
     *
     * @mbg.generated
     */
    private Integer taskType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_snapshot_metadata.snapshotNums
     *
     * @mbg.generated
     */
    private Integer snapshotNums;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_snapshot_metadata.fileSize
     *
     * @mbg.generated
     */
    private Integer fileSize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_snapshot_metadata.billStartTime
     *
     * @mbg.generated
     */
    private Date billStartTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_snapshot_metadata.billEndTime
     *
     * @mbg.generated
     */
    private Date billEndTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_snapshot_metadata.analysisTime
     *
     * @mbg.generated
     */
    private Date analysisTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_snapshot_metadata.createTime
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_snapshot_metadata.id
     *
     * @return the value of t_snapshot_metadata.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_snapshot_metadata.id
     *
     * @param id the value for t_snapshot_metadata.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_snapshot_metadata.streamId
     *
     * @return the value of t_snapshot_metadata.streamId
     *
     * @mbg.generated
     */
    public String getStreamId() {
        return streamId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_snapshot_metadata.streamId
     *
     * @param streamId the value for t_snapshot_metadata.streamId
     *
     * @mbg.generated
     */
    public void setStreamId(String streamId) {
        this.streamId = streamId == null ? null : streamId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_snapshot_metadata.taskType
     *
     * @return the value of t_snapshot_metadata.taskType
     *
     * @mbg.generated
     */
    public Integer getTaskType() {
        return taskType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_snapshot_metadata.taskType
     *
     * @param taskType the value for t_snapshot_metadata.taskType
     *
     * @mbg.generated
     */
    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_snapshot_metadata.snapshotNums
     *
     * @return the value of t_snapshot_metadata.snapshotNums
     *
     * @mbg.generated
     */
    public Integer getSnapshotNums() {
        return snapshotNums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_snapshot_metadata.snapshotNums
     *
     * @param snapshotNums the value for t_snapshot_metadata.snapshotNums
     *
     * @mbg.generated
     */
    public void setSnapshotNums(Integer snapshotNums) {
        this.snapshotNums = snapshotNums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_snapshot_metadata.fileSize
     *
     * @return the value of t_snapshot_metadata.fileSize
     *
     * @mbg.generated
     */
    public Integer getFileSize() {
        return fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_snapshot_metadata.fileSize
     *
     * @param fileSize the value for t_snapshot_metadata.fileSize
     *
     * @mbg.generated
     */
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_snapshot_metadata.billStartTime
     *
     * @return the value of t_snapshot_metadata.billStartTime
     *
     * @mbg.generated
     */
    public Date getBillStartTime() {
        return billStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_snapshot_metadata.billStartTime
     *
     * @param billStartTime the value for t_snapshot_metadata.billStartTime
     *
     * @mbg.generated
     */
    public void setBillStartTime(Date billStartTime) {
        this.billStartTime = billStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_snapshot_metadata.billEndTime
     *
     * @return the value of t_snapshot_metadata.billEndTime
     *
     * @mbg.generated
     */
    public Date getBillEndTime() {
        return billEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_snapshot_metadata.billEndTime
     *
     * @param billEndTime the value for t_snapshot_metadata.billEndTime
     *
     * @mbg.generated
     */
    public void setBillEndTime(Date billEndTime) {
        this.billEndTime = billEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_snapshot_metadata.analysisTime
     *
     * @return the value of t_snapshot_metadata.analysisTime
     *
     * @mbg.generated
     */
    public Date getAnalysisTime() {
        return analysisTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_snapshot_metadata.analysisTime
     *
     * @param analysisTime the value for t_snapshot_metadata.analysisTime
     *
     * @mbg.generated
     */
    public void setAnalysisTime(Date analysisTime) {
        this.analysisTime = analysisTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_snapshot_metadata.createTime
     *
     * @return the value of t_snapshot_metadata.createTime
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_snapshot_metadata.createTime
     *
     * @param createTime the value for t_snapshot_metadata.createTime
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_snapshot_metadata
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SnapshotMetadata other = (SnapshotMetadata) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStreamId() == null ? other.getStreamId() == null : this.getStreamId().equals(other.getStreamId()))
            && (this.getTaskType() == null ? other.getTaskType() == null : this.getTaskType().equals(other.getTaskType()))
            && (this.getSnapshotNums() == null ? other.getSnapshotNums() == null : this.getSnapshotNums().equals(other.getSnapshotNums()))
            && (this.getFileSize() == null ? other.getFileSize() == null : this.getFileSize().equals(other.getFileSize()))
            && (this.getBillStartTime() == null ? other.getBillStartTime() == null : this.getBillStartTime().equals(other.getBillStartTime()))
            && (this.getBillEndTime() == null ? other.getBillEndTime() == null : this.getBillEndTime().equals(other.getBillEndTime()))
            && (this.getAnalysisTime() == null ? other.getAnalysisTime() == null : this.getAnalysisTime().equals(other.getAnalysisTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_snapshot_metadata
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        result = prime * result + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        result = prime * result + ((getSnapshotNums() == null) ? 0 : getSnapshotNums().hashCode());
        result = prime * result + ((getFileSize() == null) ? 0 : getFileSize().hashCode());
        result = prime * result + ((getBillStartTime() == null) ? 0 : getBillStartTime().hashCode());
        result = prime * result + ((getBillEndTime() == null) ? 0 : getBillEndTime().hashCode());
        result = prime * result + ((getAnalysisTime() == null) ? 0 : getAnalysisTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}
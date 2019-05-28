package io.github.itliwei.demo.entity;


import io.github.itliwei.mvcorm.orm.IdEntity;
import io.github.itliwei.mvcorm.orm.annotation.Table;

/**
 * Created by cheshun on 17/9/26.
 */
@Table("t_job")
public class Job extends IdEntity {

    private String jobName;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}

package com.angular.myapp.domain;

import static com.angular.myapp.domain.DepartmentTestSamples.*;
import static com.angular.myapp.domain.EmployeeTestSamples.*;
import static com.angular.myapp.domain.JobHistoryTestSamples.*;
import static com.angular.myapp.domain.JobTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.angular.myapp.TestUtil;
import org.junit.jupiter.api.Test;

class JobHistoryTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(JobHistory.class);
        JobHistory jobHistory1 = getJobHistorySample1();
        JobHistory jobHistory2 = new JobHistory();
        assertThat(jobHistory1).isNotEqualTo(jobHistory2);

        jobHistory2.id = jobHistory1.id;
        assertThat(jobHistory1).isEqualTo(jobHistory2);

        jobHistory2 = getJobHistorySample2();
        assertThat(jobHistory1).isNotEqualTo(jobHistory2);
    }
}

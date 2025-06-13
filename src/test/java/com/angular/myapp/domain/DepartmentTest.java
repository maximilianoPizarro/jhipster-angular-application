package com.angular.myapp.domain;

import static com.angular.myapp.domain.DepartmentTestSamples.*;
import static com.angular.myapp.domain.EmployeeTestSamples.*;
import static com.angular.myapp.domain.JobHistoryTestSamples.*;
import static com.angular.myapp.domain.LocationTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.angular.myapp.TestUtil;
import org.junit.jupiter.api.Test;

class DepartmentTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Department.class);
        Department department1 = getDepartmentSample1();
        Department department2 = new Department();
        assertThat(department1).isNotEqualTo(department2);

        department2.id = department1.id;
        assertThat(department1).isEqualTo(department2);

        department2 = getDepartmentSample2();
        assertThat(department1).isNotEqualTo(department2);
    }
}

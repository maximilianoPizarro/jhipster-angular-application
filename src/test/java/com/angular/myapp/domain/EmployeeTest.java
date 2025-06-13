package com.angular.myapp.domain;

import static com.angular.myapp.domain.DepartmentTestSamples.*;
import static com.angular.myapp.domain.EmployeeTestSamples.*;
import static com.angular.myapp.domain.EmployeeTestSamples.*;
import static com.angular.myapp.domain.JobHistoryTestSamples.*;
import static com.angular.myapp.domain.JobTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.angular.myapp.TestUtil;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Employee.class);
        Employee employee1 = getEmployeeSample1();
        Employee employee2 = new Employee();
        assertThat(employee1).isNotEqualTo(employee2);

        employee2.id = employee1.id;
        assertThat(employee1).isEqualTo(employee2);

        employee2 = getEmployeeSample2();
        assertThat(employee1).isNotEqualTo(employee2);
    }
}

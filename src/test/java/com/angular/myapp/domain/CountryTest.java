package com.angular.myapp.domain;

import static com.angular.myapp.domain.CountryTestSamples.*;
import static com.angular.myapp.domain.LocationTestSamples.*;
import static com.angular.myapp.domain.RegionTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.angular.myapp.TestUtil;
import org.junit.jupiter.api.Test;

class CountryTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Country.class);
        Country country1 = getCountrySample1();
        Country country2 = new Country();
        assertThat(country1).isNotEqualTo(country2);

        country2.id = country1.id;
        assertThat(country1).isEqualTo(country2);

        country2 = getCountrySample2();
        assertThat(country1).isNotEqualTo(country2);
    }
}

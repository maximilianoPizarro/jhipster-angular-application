package com.angular.myapp.web.rest;

import static io.restassured.RestAssured.given;
import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;
import static jakarta.ws.rs.core.Response.Status.OK;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;

import com.angular.myapp.builder.UserBuilder;
import com.angular.myapp.infrastructure.EmailServerResource;
import com.angular.myapp.infrastructure.InjectMailServer;
import com.angular.myapp.security.AuthoritiesConstants;
import com.angular.myapp.utility.IntegrationTestBase;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusIntegrationTest;
import jakarta.ws.rs.core.HttpHeaders;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@QuarkusIntegrationTest
@TestHTTPEndpoint(AccountResource.class)
@QuarkusTestResource(value = EmailServerResource.class, restrictToAnnotatedClass = true)
class AccountResourceIT extends IntegrationTestBase {

    @InjectMailServer
    String mailServerUrl;

    UserBuilder userBuilder;

    @BeforeEach
    void init() {
        userBuilder = UserBuilder.aUser()
            .withLogin("johndoe")
            .withPassword("Passw0rd")
            .withFirstName("John")
            .withLastName("Doe")
            .withEmail("john.doe@jhipster.tech")
            .withImageUrl("http://placehold.it/50x50")
            .withLangKey("en");
    }

    @Test
    void should_allow_authenticated_user_to_retrieve_own_account_details() {
        var user = userBuilder.buildVM();

        registerAndActivateUser(user);

        given()
            .header(HttpHeaders.AUTHORIZATION, "Bearer " + authenticateUser(user.login, user.password))
            .when()
            .get("/account")
            .then()
            .statusCode(OK.getStatusCode())
            .contentType(APPLICATION_JSON)
            .body("login", is(user.login))
            .body("firstName", is(user.firstName))
            .body("lastName", is(user.lastName))
            .body("email", is(user.email))
            .body("imageUrl", is(user.imageUrl))
            .body("langKey", is(user.langKey))
            .body("authorities", hasItems(AuthoritiesConstants.USER));
    }

    @Override
    public String getMailServerUrl() {
        return mailServerUrl;
    }
}

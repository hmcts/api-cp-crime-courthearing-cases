package uk.gov.hmcts.cp.config;

import org.junit.jupiter.api.Test;
import uk.gov.hmcts.cp.openapi.api.CasesApi;
import uk.gov.hmcts.cp.openapi.model.CaseJudiciaryResponse;
import uk.gov.hmcts.cp.openapi.model.CaseJudiciaryResult;
import uk.gov.hmcts.cp.openapi.model.ErrorResponse;

import static org.assertj.core.api.Assertions.assertThat;

public class OpenApiObjectsTest {

    @Test
    void generated_error_response_should_have_expected_fields() {
        assertThat(ErrorResponse.class).hasDeclaredFields("error", "details", "message", "timestamp", "traceId");
    }

    @Test
    void generated_judiciary_response_should_have_expected_fields() {
        assertThat(CaseJudiciaryResponse.class).hasDeclaredFields("caseResults");
    }

    @Test
    void generated_judiciary_result_should_have_expected_fields() {
        assertThat(CaseJudiciaryResult.class).hasDeclaredFields("resultText", "caseUrn", "hearingId");
    }

    @Test
    void generated_api_should_have_expected_methods() {
        assertThat(CasesApi.class).hasDeclaredMethods("getCaseLevelResults");
    }
}

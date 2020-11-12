package org.meng.easycollect.bean.rsp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author meng
 */
@Data
public class AccessTokenResponse {
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("scope")
    private String scope;
}

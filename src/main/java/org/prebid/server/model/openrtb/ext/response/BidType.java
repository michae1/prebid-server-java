package org.prebid.server.model.openrtb.ext.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum BidType {
    banner, video, audio, @JsonProperty("native") xNative
}
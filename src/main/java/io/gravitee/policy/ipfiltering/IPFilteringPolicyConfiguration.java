/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.policy.ipfiltering;

import io.gravitee.policy.api.PolicyConfiguration;
import java.util.List;

@SuppressWarnings("unused")
public class IPFilteringPolicyConfiguration implements PolicyConfiguration {

    /**
     * true if X-Forwarded-For header param must be filtered, false otherwise
     */
    private boolean matchAllFromXForwardedFor = false;

    /**
     * The list of IP that are allowed to be call the api.
     */
    private List<String> whitelistIps;

    /**
     * The list of IP that are not allowed to be call the api.
     */
    private List<String> blacklistIps;

    public boolean isMatchAllFromXForwardedFor() {
        return matchAllFromXForwardedFor;
    }

    public void setMatchAllFromXForwardedFor(boolean matchAllFromXForwardedFor) {
        this.matchAllFromXForwardedFor = matchAllFromXForwardedFor;
    }

    public List<String> getWhitelistIps() {
        return whitelistIps;
    }

    public void setWhitelistIps(List<String> whitelistIps) {
        this.whitelistIps = whitelistIps;
    }

    public List<String> getBlacklistIps() {
        return blacklistIps;
    }

    public void setBlacklistIps(List<String> blacklistIps) {
        this.blacklistIps = blacklistIps;
    }
}

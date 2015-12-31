/**
 * Copyright 2014- Qubole Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qubole.qds.sdk.java.client;

import javax.ws.rs.client.Client;

/**
 * Initialization values, etc.
 */
public interface QdsConfiguration
{
    /**
     * Return a new Jersey client
     *
     * @return client
     */
    public Client newClient();

    /**
     * Return the API token
     *
     * @return API token
     */
    public String getApiToken();

    /**
     * Return the main endpoint, e.g. "https://api.qubole.com/api"
     *
     * @return endpoint
     */
    public String getApiEndpoint();

    /**
     * Return the API version, e.g. "v1.2"
     *
     * @return version
     */
    public String getApiVersion();
    
    /**
     * Return the API version v1.3
     *
     * @return version
     */
    public String getApiVersionV13();
}

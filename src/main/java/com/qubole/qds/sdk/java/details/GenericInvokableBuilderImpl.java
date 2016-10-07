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
package com.qubole.qds.sdk.java.details;

import com.qubole.qds.sdk.java.api.InvokableBuilder;
import com.qubole.qds.sdk.java.client.QdsClient;
import javax.ws.rs.core.GenericType;

class GenericInvokableBuilderImpl<T> extends InvocationCallbackBase<T> implements InvokableBuilder<T>
{
    private final QdsClient client;
    private final RequestDetails entity;
    private final Class<T> responseType;
    private final GenericType<T> genericResponseType;
    private final String[] additionalPaths;

    @Override
    protected InvokeArguments<T> getInvokeArguments()
    {
        if (genericResponseType != null)
        {
            return new InvokeArguments<T>(client, null, entity, genericResponseType, additionalPaths);
        }
        return new InvokeArguments<T>(client, null, entity, responseType, additionalPaths);
    }

    GenericInvokableBuilderImpl(QdsClient client, RequestDetails entity, Class<T> responseType, String... additionalPaths)
    {
        this.client = client;
        this.entity = entity;
        this.responseType = responseType;
        this.genericResponseType = null;
        this.additionalPaths = additionalPaths;
    }

    GenericInvokableBuilderImpl(QdsClient client, RequestDetails entity, GenericType<T> responseType, String... additionalPaths)
    {
        this.client = client;
        this.entity = entity;
        this.responseType = null;
        this.genericResponseType = responseType;
        this.additionalPaths = additionalPaths;
    }
}

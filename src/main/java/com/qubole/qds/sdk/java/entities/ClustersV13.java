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
package com.qubole.qds.sdk.java.entities;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClustersV13
{
    private List<ClusterV13> clusters;
    private PagingInfo paging_info;

    public ClustersV13()
    {
    }

    public ClustersV13(List<ClusterV13> clusters, PagingInfo paging_info)
    {
        this.clusters = clusters;
        this.paging_info = paging_info;
    }

    public List<ClusterV13> getClusters()
    {
        return clusters;
    }

    public void setClusters(List<ClusterV13> clusters)
    {
        this.clusters = clusters;
    }

    public PagingInfo getPaging_info()
    {
        return paging_info;
    }

    public void setPaging_info(PagingInfo paging_info)
    {
        this.paging_info = paging_info;
    }
}

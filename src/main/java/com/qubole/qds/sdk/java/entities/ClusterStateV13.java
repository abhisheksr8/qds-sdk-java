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
public class ClusterStateV13
{
    
    private String start_at;
    private String down_at;
    private String terminate_reason;
    private String last_health_check_action;
    private String last_health_check_action_at;
    private long cluster_id;
    private long config_id;
    private String state;
    private List<ClusterNodeV13> nodes;
    
    public ClusterStateV13()
    {
    }

    public ClusterStateV13(String state, String last_health_check_action_at, String start_at, String down_at, long cluster_id, String terminate_reason, List<ClusterNodeV13> nodes, String last_health_check_action, long config_id)
    {
        this.state = state;
        this.last_health_check_action_at = last_health_check_action_at;
        this.start_at = start_at;
        this.down_at = down_at;
        this.cluster_id = cluster_id;
        this.terminate_reason = terminate_reason;
        this.nodes = nodes;
        this.last_health_check_action = last_health_check_action;
        this.config_id = config_id;
    }
    
    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getLast_health_check_action_at()
    {
        return last_health_check_action_at;
    }

    public void setLast_health_check_action_at(String last_health_check_action_at)
    {
        this.last_health_check_action_at = last_health_check_action_at;
    }

    public String getStart_at()
    {
        return start_at;
    }

    public void setStart_at(String start_at)
    {
        this.start_at = start_at;
    }

    public String getDown_at()
    {
        return down_at;
    }

    public void setDown_at(String down_at)
    {
        this.down_at = down_at;
    }

    public long getCluster_id()
    {
        return cluster_id;
    }

    public void setCluster_id(long cluster_id)
    {
        this.cluster_id = cluster_id;
    }

    public String getTerminate_reason()
    {
        return terminate_reason;
    }

    public void setTerminate_reason(String terminate_reason)
    {
        this.terminate_reason = terminate_reason;
    }

    public List<ClusterNodeV13> getNodes()
    {
        return nodes;
    }

    public void setNodes(List<ClusterNodeV13> nodes)
    {
        this.nodes = nodes;
    }

    public String getLast_health_check_action()
    {
        return last_health_check_action;
    }

    public void setLast_health_check_action(String last_health_check_action)
    {
        this.last_health_check_action = last_health_check_action;
    }

    public long getConfig_id()
    {
        return config_id;
    }

    public void setConfig_id(long config_id)
    {
        this.config_id = config_id;
    }
}

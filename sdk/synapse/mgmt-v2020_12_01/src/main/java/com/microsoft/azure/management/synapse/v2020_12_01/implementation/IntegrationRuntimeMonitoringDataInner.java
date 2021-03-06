/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import java.util.List;
import com.microsoft.azure.management.synapse.v2020_12_01.IntegrationRuntimeNodeMonitoringData;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Get monitoring data response.
 */
public class IntegrationRuntimeMonitoringDataInner {
    /**
     * Integration runtime name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Integration runtime node monitoring data.
     */
    @JsonProperty(value = "nodes")
    private List<IntegrationRuntimeNodeMonitoringData> nodes;

    /**
     * Get integration runtime name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set integration runtime name.
     *
     * @param name the name value to set
     * @return the IntegrationRuntimeMonitoringDataInner object itself.
     */
    public IntegrationRuntimeMonitoringDataInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get integration runtime node monitoring data.
     *
     * @return the nodes value
     */
    public List<IntegrationRuntimeNodeMonitoringData> nodes() {
        return this.nodes;
    }

    /**
     * Set integration runtime node monitoring data.
     *
     * @param nodes the nodes value to set
     * @return the IntegrationRuntimeMonitoringDataInner object itself.
     */
    public IntegrationRuntimeMonitoringDataInner withNodes(List<IntegrationRuntimeNodeMonitoringData> nodes) {
        this.nodes = nodes;
        return this;
    }

}

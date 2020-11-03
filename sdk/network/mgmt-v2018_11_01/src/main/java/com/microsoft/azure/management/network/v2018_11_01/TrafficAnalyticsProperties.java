/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters that define the configuration of traffic analytics.
 */
public class TrafficAnalyticsProperties {
    /**
     * The networkWatcherFlowAnalyticsConfiguration property.
     */
    @JsonProperty(value = "networkWatcherFlowAnalyticsConfiguration", required = true)
    private TrafficAnalyticsConfigurationProperties networkWatcherFlowAnalyticsConfiguration;

    /**
     * Get the networkWatcherFlowAnalyticsConfiguration value.
     *
     * @return the networkWatcherFlowAnalyticsConfiguration value
     */
    public TrafficAnalyticsConfigurationProperties networkWatcherFlowAnalyticsConfiguration() {
        return this.networkWatcherFlowAnalyticsConfiguration;
    }

    /**
     * Set the networkWatcherFlowAnalyticsConfiguration value.
     *
     * @param networkWatcherFlowAnalyticsConfiguration the networkWatcherFlowAnalyticsConfiguration value to set
     * @return the TrafficAnalyticsProperties object itself.
     */
    public TrafficAnalyticsProperties withNetworkWatcherFlowAnalyticsConfiguration(TrafficAnalyticsConfigurationProperties networkWatcherFlowAnalyticsConfiguration) {
        this.networkWatcherFlowAnalyticsConfiguration = networkWatcherFlowAnalyticsConfiguration;
        return this;
    }

}

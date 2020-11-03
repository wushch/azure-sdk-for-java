/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_11_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for LoadBalancerSkuName.
 */
public final class LoadBalancerSkuName extends ExpandableStringEnum<LoadBalancerSkuName> {
    /** Static value Basic for LoadBalancerSkuName. */
    public static final LoadBalancerSkuName BASIC = fromString("Basic");

    /** Static value Standard for LoadBalancerSkuName. */
    public static final LoadBalancerSkuName STANDARD = fromString("Standard");

    /**
     * Creates or finds a LoadBalancerSkuName from its string representation.
     * @param name a name to look for
     * @return the corresponding LoadBalancerSkuName
     */
    @JsonCreator
    public static LoadBalancerSkuName fromString(String name) {
        return fromString(name, LoadBalancerSkuName.class);
    }

    /**
     * @return known LoadBalancerSkuName values
     */
    public static Collection<LoadBalancerSkuName> values() {
        return values(LoadBalancerSkuName.class);
    }
}

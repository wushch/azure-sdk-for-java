/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.AppServiceManager;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.SlotDifferenceInner;

/**
 * Type representing SlotDifference.
 */
public interface SlotDifference extends HasInner<SlotDifferenceInner>, HasManager<AppServiceManager> {
    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the diffRule value.
     */
    String diffRule();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the settingName value.
     */
    String settingName();

    /**
     * @return the settingType value.
     */
    String settingType();

    /**
     * @return the slotDifferenceType value.
     */
    String slotDifferenceType();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the valueInCurrentSlot value.
     */
    String valueInCurrentSlot();

    /**
     * @return the valueInTargetSlot value.
     */
    String valueInTargetSlot();

}

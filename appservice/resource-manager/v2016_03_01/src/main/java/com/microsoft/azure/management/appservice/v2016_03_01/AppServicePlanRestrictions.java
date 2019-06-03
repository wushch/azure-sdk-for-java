/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for AppServicePlanRestrictions.
 */
public enum AppServicePlanRestrictions {
    /** Enum value None. */
    NONE("None"),

    /** Enum value Free. */
    FREE("Free"),

    /** Enum value Shared. */
    SHARED("Shared"),

    /** Enum value Basic. */
    BASIC("Basic"),

    /** Enum value Standard. */
    STANDARD("Standard"),

    /** Enum value Premium. */
    PREMIUM("Premium");

    /** The actual serialized value for a AppServicePlanRestrictions instance. */
    private String value;

    AppServicePlanRestrictions(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AppServicePlanRestrictions instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AppServicePlanRestrictions object, or null if unable to parse.
     */
    @JsonCreator
    public static AppServicePlanRestrictions fromString(String value) {
        AppServicePlanRestrictions[] items = AppServicePlanRestrictions.values();
        for (AppServicePlanRestrictions item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}

/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import java.util.List;
import org.joda.time.DateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An operation on a resource.
 */
public class Operation {
    /**
     * Operation ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Operation name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The current status of the operation. Possible values include:
     * 'InProgress', 'Failed', 'Succeeded', 'TimedOut', 'Created'.
     */
    @JsonProperty(value = "status")
    private OperationStatus status;

    /**
     * Any errors associate with the operation.
     */
    @JsonProperty(value = "errors")
    private List<ErrorEntity> errors;

    /**
     * Time when operation has started.
     */
    @JsonProperty(value = "createdTime")
    private DateTime createdTime;

    /**
     * Time when operation has been updated.
     */
    @JsonProperty(value = "modifiedTime")
    private DateTime modifiedTime;

    /**
     * Time when operation will expire.
     */
    @JsonProperty(value = "expirationTime")
    private DateTime expirationTime;

    /**
     * Applicable only for stamp operation ids.
     */
    @JsonProperty(value = "geoMasterOperationId")
    private UUID geoMasterOperationId;

    /**
     * Get operation ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set operation ID.
     *
     * @param id the id value to set
     * @return the Operation object itself.
     */
    public Operation withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get operation name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set operation name.
     *
     * @param name the name value to set
     * @return the Operation object itself.
     */
    public Operation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the current status of the operation. Possible values include: 'InProgress', 'Failed', 'Succeeded', 'TimedOut', 'Created'.
     *
     * @return the status value
     */
    public OperationStatus status() {
        return this.status;
    }

    /**
     * Set the current status of the operation. Possible values include: 'InProgress', 'Failed', 'Succeeded', 'TimedOut', 'Created'.
     *
     * @param status the status value to set
     * @return the Operation object itself.
     */
    public Operation withStatus(OperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get any errors associate with the operation.
     *
     * @return the errors value
     */
    public List<ErrorEntity> errors() {
        return this.errors;
    }

    /**
     * Set any errors associate with the operation.
     *
     * @param errors the errors value to set
     * @return the Operation object itself.
     */
    public Operation withErrors(List<ErrorEntity> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get time when operation has started.
     *
     * @return the createdTime value
     */
    public DateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Set time when operation has started.
     *
     * @param createdTime the createdTime value to set
     * @return the Operation object itself.
     */
    public Operation withCreatedTime(DateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Get time when operation has been updated.
     *
     * @return the modifiedTime value
     */
    public DateTime modifiedTime() {
        return this.modifiedTime;
    }

    /**
     * Set time when operation has been updated.
     *
     * @param modifiedTime the modifiedTime value to set
     * @return the Operation object itself.
     */
    public Operation withModifiedTime(DateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * Get time when operation will expire.
     *
     * @return the expirationTime value
     */
    public DateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Set time when operation will expire.
     *
     * @param expirationTime the expirationTime value to set
     * @return the Operation object itself.
     */
    public Operation withExpirationTime(DateTime expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * Get applicable only for stamp operation ids.
     *
     * @return the geoMasterOperationId value
     */
    public UUID geoMasterOperationId() {
        return this.geoMasterOperationId;
    }

    /**
     * Set applicable only for stamp operation ids.
     *
     * @param geoMasterOperationId the geoMasterOperationId value to set
     * @return the Operation object itself.
     */
    public Operation withGeoMasterOperationId(UUID geoMasterOperationId) {
        this.geoMasterOperationId = geoMasterOperationId;
        return this;
    }

}

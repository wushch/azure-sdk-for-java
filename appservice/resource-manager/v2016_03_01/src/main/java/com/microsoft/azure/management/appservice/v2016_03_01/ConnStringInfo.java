/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Database connection string information.
 */
public class ConnStringInfo {
    /**
     * Name of connection string.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Connection string value.
     */
    @JsonProperty(value = "connectionString")
    private String connectionString;

    /**
     * Type of database. Possible values include: 'MySql', 'SQLServer',
     * 'SQLAzure', 'Custom', 'NotificationHub', 'ServiceBus', 'EventHub',
     * 'ApiHub', 'DocDb', 'RedisCache', 'PostgreSQL'.
     */
    @JsonProperty(value = "type")
    private ConnectionStringType type;

    /**
     * Get name of connection string.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of connection string.
     *
     * @param name the name value to set
     * @return the ConnStringInfo object itself.
     */
    public ConnStringInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get connection string value.
     *
     * @return the connectionString value
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set connection string value.
     *
     * @param connectionString the connectionString value to set
     * @return the ConnStringInfo object itself.
     */
    public ConnStringInfo withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get type of database. Possible values include: 'MySql', 'SQLServer', 'SQLAzure', 'Custom', 'NotificationHub', 'ServiceBus', 'EventHub', 'ApiHub', 'DocDb', 'RedisCache', 'PostgreSQL'.
     *
     * @return the type value
     */
    public ConnectionStringType type() {
        return this.type;
    }

    /**
     * Set type of database. Possible values include: 'MySql', 'SQLServer', 'SQLAzure', 'Custom', 'NotificationHub', 'ServiceBus', 'EventHub', 'ApiHub', 'DocDb', 'RedisCache', 'PostgreSQL'.
     *
     * @param type the type value to set
     * @return the ConnStringInfo object itself.
     */
    public ConnStringInfo withType(ConnectionStringType type) {
        this.type = type;
        return this;
    }

}

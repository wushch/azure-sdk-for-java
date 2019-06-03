/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Publishing options for requested profile.
 */
public class CsmPublishingProfileOptions {
    /**
     * Name of the format. Valid values are:
     * FileZilla3
     * WebDeploy -- default
     * Ftp. Possible values include: 'FileZilla3', 'WebDeploy', 'Ftp'.
     */
    @JsonProperty(value = "format")
    private PublishingProfileFormat format;

    /**
     * Get name of the format. Valid values are:
     FileZilla3
     WebDeploy -- default
     Ftp. Possible values include: 'FileZilla3', 'WebDeploy', 'Ftp'.
     *
     * @return the format value
     */
    public PublishingProfileFormat format() {
        return this.format;
    }

    /**
     * Set name of the format. Valid values are:
     FileZilla3
     WebDeploy -- default
     Ftp. Possible values include: 'FileZilla3', 'WebDeploy', 'Ftp'.
     *
     * @param format the format value to set
     * @return the CsmPublishingProfileOptions object itself.
     */
    public CsmPublishingProfileOptions withFormat(PublishingProfileFormat format) {
        this.format = format;
        return this;
    }

}

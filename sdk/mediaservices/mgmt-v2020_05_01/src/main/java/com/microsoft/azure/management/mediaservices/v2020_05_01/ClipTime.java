/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base class for specifying a clip time. Use sub classes of this class to
 * specify the time position in the media.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = ClipTime.class)
@JsonTypeName("ClipTime")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.AbsoluteClipTime", value = AbsoluteClipTime.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.UtcClipTime", value = UtcClipTime.class)
})
public class ClipTime {
}

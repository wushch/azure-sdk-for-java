/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_09_18;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.kusto.v2020_09_18.implementation.KustoManager;
import com.microsoft.azure.management.kusto.v2020_09_18.implementation.LanguageExtensionInner;

/**
 * Type representing LanguageExtension.
 */
public interface LanguageExtension extends HasInner<LanguageExtensionInner>, HasManager<KustoManager> {
    /**
     * @return the languageExtensionName value.
     */
    LanguageExtensionName languageExtensionName();

}

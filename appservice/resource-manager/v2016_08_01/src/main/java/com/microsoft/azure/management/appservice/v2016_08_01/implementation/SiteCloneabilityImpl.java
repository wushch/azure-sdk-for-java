/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import com.microsoft.azure.management.appservice.v2016_08_01.SiteCloneability;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.appservice.v2016_08_01.SiteCloneabilityCriterion;
import com.microsoft.azure.management.appservice.v2016_08_01.CloneAbilityResult;

class SiteCloneabilityImpl extends WrapperImpl<SiteCloneabilityInner> implements SiteCloneability {
    private final AppServiceManager manager;
    SiteCloneabilityImpl(SiteCloneabilityInner inner, AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public List<SiteCloneabilityCriterion> blockingCharacteristics() {
        return this.inner().blockingCharacteristics();
    }

    @Override
    public List<SiteCloneabilityCriterion> blockingFeatures() {
        return this.inner().blockingFeatures();
    }

    @Override
    public CloneAbilityResult result() {
        return this.inner().result();
    }

    @Override
    public List<SiteCloneabilityCriterion> unsupportedFeatures() {
        return this.inner().unsupportedFeatures();
    }

}

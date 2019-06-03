/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01.implementation;

import com.microsoft.azure.management.appservice.v2016_09_01.Capability;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;

class CapabilityImpl extends WrapperImpl<CapabilityInner> implements Capability {
    private final AppServiceManager manager;

    CapabilityImpl(CapabilityInner inner,  AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }



    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String reason() {
        return this.inner().reason();
    }

    @Override
    public String value() {
        return this.inner().value();
    }

}

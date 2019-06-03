/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import com.microsoft.azure.management.appservice.v2016_08_01.ConnectionStringDictionary;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.Map;
import com.microsoft.azure.management.appservice.v2016_08_01.ConnStringValueTypePair;

class ConnectionStringDictionaryImpl extends WrapperImpl<ConnectionStringDictionaryInner> implements ConnectionStringDictionary {
    private final AppServiceManager manager;
    ConnectionStringDictionaryImpl(ConnectionStringDictionaryInner inner, AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Map<String, ConnStringValueTypePair> properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}

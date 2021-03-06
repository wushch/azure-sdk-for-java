/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview.implementation;

import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.Node;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.NodeStatus;

class NodeImpl extends WrapperImpl<NodeInner> implements Node {
    private final DataBoxEdgeManager manager;

    NodeImpl(NodeInner inner,  DataBoxEdgeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataBoxEdgeManager manager() {
        return this.manager;
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String nodeChassisSerialNumber() {
        return this.inner().nodeChassisSerialNumber();
    }

    @Override
    public String nodeDisplayName() {
        return this.inner().nodeDisplayName();
    }

    @Override
    public String nodeFriendlySoftwareVersion() {
        return this.inner().nodeFriendlySoftwareVersion();
    }

    @Override
    public String nodeHcsVersion() {
        return this.inner().nodeHcsVersion();
    }

    @Override
    public String nodeInstanceId() {
        return this.inner().nodeInstanceId();
    }

    @Override
    public String nodeSerialNumber() {
        return this.inner().nodeSerialNumber();
    }

    @Override
    public NodeStatus nodeStatus() {
        return this.inner().nodeStatus();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}

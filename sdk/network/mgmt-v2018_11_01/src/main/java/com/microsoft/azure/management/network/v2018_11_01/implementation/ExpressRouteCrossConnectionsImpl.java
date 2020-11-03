/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2018_11_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2018_11_01.ExpressRouteCrossConnections;
import com.microsoft.azure.management.network.v2018_11_01.ExpressRouteCrossConnection;
import rx.Observable;
import rx.Completable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2018_11_01.ExpressRouteCircuitsArpTableListResult;
import com.microsoft.azure.management.network.v2018_11_01.ExpressRouteCrossConnectionsRoutesTableSummaryListResult;
import com.microsoft.azure.management.network.v2018_11_01.ExpressRouteCircuitsRoutesTableListResult;

class ExpressRouteCrossConnectionsImpl extends GroupableResourcesCoreImpl<ExpressRouteCrossConnection, ExpressRouteCrossConnectionImpl, ExpressRouteCrossConnectionInner, ExpressRouteCrossConnectionsInner, NetworkManager>  implements ExpressRouteCrossConnections {
    protected ExpressRouteCrossConnectionsImpl(NetworkManager manager) {
        super(manager.inner().expressRouteCrossConnections(), manager);
    }

    @Override
    protected Observable<ExpressRouteCrossConnectionInner> getInnerAsync(String resourceGroupName, String name) {
        ExpressRouteCrossConnectionsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ExpressRouteCrossConnectionsInner client = this.inner();
        return Completable.error(new Throwable("Delete by RG not supported for this resource")); // NOP Delete by RG not supported
    }

    @Override
    public PagedList<ExpressRouteCrossConnection> listByResourceGroup(String resourceGroupName) {
        ExpressRouteCrossConnectionsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<ExpressRouteCrossConnection> listByResourceGroupAsync(String resourceGroupName) {
        ExpressRouteCrossConnectionsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ExpressRouteCrossConnectionInner>, Iterable<ExpressRouteCrossConnectionInner>>() {
            @Override
            public Iterable<ExpressRouteCrossConnectionInner> call(Page<ExpressRouteCrossConnectionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ExpressRouteCrossConnectionInner, ExpressRouteCrossConnection>() {
            @Override
            public ExpressRouteCrossConnection call(ExpressRouteCrossConnectionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<ExpressRouteCrossConnection> list() {
        ExpressRouteCrossConnectionsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<ExpressRouteCrossConnection> listAsync() {
        ExpressRouteCrossConnectionsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ExpressRouteCrossConnectionInner>, Iterable<ExpressRouteCrossConnectionInner>>() {
            @Override
            public Iterable<ExpressRouteCrossConnectionInner> call(Page<ExpressRouteCrossConnectionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ExpressRouteCrossConnectionInner, ExpressRouteCrossConnection>() {
            @Override
            public ExpressRouteCrossConnection call(ExpressRouteCrossConnectionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ExpressRouteCrossConnectionImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected ExpressRouteCrossConnectionImpl wrapModel(ExpressRouteCrossConnectionInner inner) {
        return  new ExpressRouteCrossConnectionImpl(inner.name(), inner, manager());
    }

    @Override
    protected ExpressRouteCrossConnectionImpl wrapModel(String name) {
        return new ExpressRouteCrossConnectionImpl(name, new ExpressRouteCrossConnectionInner(), this.manager());
    }

    @Override
    public Observable<ExpressRouteCircuitsArpTableListResult> listArpTableAsync(String resourceGroupName, String crossConnectionName, String peeringName, String devicePath) {
        ExpressRouteCrossConnectionsInner client = this.inner();
        return client.listArpTableAsync(resourceGroupName, crossConnectionName, peeringName, devicePath)
        .map(new Func1<ExpressRouteCircuitsArpTableListResultInner, ExpressRouteCircuitsArpTableListResult>() {
            @Override
            public ExpressRouteCircuitsArpTableListResult call(ExpressRouteCircuitsArpTableListResultInner inner) {
                return new ExpressRouteCircuitsArpTableListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ExpressRouteCrossConnectionsRoutesTableSummaryListResult> listRoutesTableSummaryAsync(String resourceGroupName, String crossConnectionName, String peeringName, String devicePath) {
        ExpressRouteCrossConnectionsInner client = this.inner();
        return client.listRoutesTableSummaryAsync(resourceGroupName, crossConnectionName, peeringName, devicePath)
        .map(new Func1<ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner, ExpressRouteCrossConnectionsRoutesTableSummaryListResult>() {
            @Override
            public ExpressRouteCrossConnectionsRoutesTableSummaryListResult call(ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner inner) {
                return new ExpressRouteCrossConnectionsRoutesTableSummaryListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ExpressRouteCircuitsRoutesTableListResult> listRoutesTableAsync(String resourceGroupName, String crossConnectionName, String peeringName, String devicePath) {
        ExpressRouteCrossConnectionsInner client = this.inner();
        return client.listRoutesTableAsync(resourceGroupName, crossConnectionName, peeringName, devicePath)
        .map(new Func1<ExpressRouteCircuitsRoutesTableListResultInner, ExpressRouteCircuitsRoutesTableListResult>() {
            @Override
            public ExpressRouteCircuitsRoutesTableListResult call(ExpressRouteCircuitsRoutesTableListResultInner inner) {
                return new ExpressRouteCircuitsRoutesTableListResultImpl(inner, manager());
            }
        });
    }

}

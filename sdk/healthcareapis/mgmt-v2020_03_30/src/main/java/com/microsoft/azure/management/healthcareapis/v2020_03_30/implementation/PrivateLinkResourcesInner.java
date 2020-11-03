/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2020_03_30.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PrivateLinkResources.
 */
public class PrivateLinkResourcesInner {
    /** The Retrofit service to perform REST calls. */
    private PrivateLinkResourcesService service;
    /** The service client containing this operation class. */
    private HealthcareApisManagementClientImpl client;

    /**
     * Initializes an instance of PrivateLinkResourcesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PrivateLinkResourcesInner(Retrofit retrofit, HealthcareApisManagementClientImpl client) {
        this.service = retrofit.create(PrivateLinkResourcesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PrivateLinkResources to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PrivateLinkResourcesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.healthcareapis.v2020_03_30.PrivateLinkResources listByService" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.HealthcareApis/services/{resourceName}/privateLinkResources")
        Observable<Response<ResponseBody>> listByService(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("resourceName") String resourceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.healthcareapis.v2020_03_30.PrivateLinkResources get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.HealthcareApis/services/{resourceName}/privateLinkResources/{groupName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("resourceName") String resourceName, @Path("groupName") String groupName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the private link resources that need to be created for a service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorDetailsInnerException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateLinkResourceListResultInner object if successful.
     */
    public PrivateLinkResourceListResultInner listByService(String resourceGroupName, String resourceName) {
        return listByServiceWithServiceResponseAsync(resourceGroupName, resourceName).toBlocking().single().body();
    }

    /**
     * Gets the private link resources that need to be created for a service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateLinkResourceListResultInner> listByServiceAsync(String resourceGroupName, String resourceName, final ServiceCallback<PrivateLinkResourceListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByServiceWithServiceResponseAsync(resourceGroupName, resourceName), serviceCallback);
    }

    /**
     * Gets the private link resources that need to be created for a service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateLinkResourceListResultInner object
     */
    public Observable<PrivateLinkResourceListResultInner> listByServiceAsync(String resourceGroupName, String resourceName) {
        return listByServiceWithServiceResponseAsync(resourceGroupName, resourceName).map(new Func1<ServiceResponse<PrivateLinkResourceListResultInner>, PrivateLinkResourceListResultInner>() {
            @Override
            public PrivateLinkResourceListResultInner call(ServiceResponse<PrivateLinkResourceListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the private link resources that need to be created for a service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateLinkResourceListResultInner object
     */
    public Observable<ServiceResponse<PrivateLinkResourceListResultInner>> listByServiceWithServiceResponseAsync(String resourceGroupName, String resourceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByService(this.client.subscriptionId(), resourceGroupName, resourceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateLinkResourceListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<PrivateLinkResourceListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateLinkResourceListResultInner> clientResponse = listByServiceDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PrivateLinkResourceListResultInner> listByServiceDelegate(Response<ResponseBody> response) throws ErrorDetailsInnerException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateLinkResourceListResultInner, ErrorDetailsInnerException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateLinkResourceListResultInner>() { }.getType())
                .registerError(ErrorDetailsInnerException.class)
                .build(response);
    }

    /**
     * Gets a private link resource that need to be created for a service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param groupName The name of the private link resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorDetailsInnerException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateLinkResourceInner object if successful.
     */
    public PrivateLinkResourceInner get(String resourceGroupName, String resourceName, String groupName) {
        return getWithServiceResponseAsync(resourceGroupName, resourceName, groupName).toBlocking().single().body();
    }

    /**
     * Gets a private link resource that need to be created for a service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param groupName The name of the private link resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateLinkResourceInner> getAsync(String resourceGroupName, String resourceName, String groupName, final ServiceCallback<PrivateLinkResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, resourceName, groupName), serviceCallback);
    }

    /**
     * Gets a private link resource that need to be created for a service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param groupName The name of the private link resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateLinkResourceInner object
     */
    public Observable<PrivateLinkResourceInner> getAsync(String resourceGroupName, String resourceName, String groupName) {
        return getWithServiceResponseAsync(resourceGroupName, resourceName, groupName).map(new Func1<ServiceResponse<PrivateLinkResourceInner>, PrivateLinkResourceInner>() {
            @Override
            public PrivateLinkResourceInner call(ServiceResponse<PrivateLinkResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a private link resource that need to be created for a service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param groupName The name of the private link resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateLinkResourceInner object
     */
    public Observable<ServiceResponse<PrivateLinkResourceInner>> getWithServiceResponseAsync(String resourceGroupName, String resourceName, String groupName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (groupName == null) {
            throw new IllegalArgumentException("Parameter groupName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, resourceName, groupName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateLinkResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<PrivateLinkResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateLinkResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PrivateLinkResourceInner> getDelegate(Response<ResponseBody> response) throws ErrorDetailsInnerException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateLinkResourceInner, ErrorDetailsInnerException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateLinkResourceInner>() { }.getType())
                .registerError(ErrorDetailsInnerException.class)
                .build(response);
    }

}

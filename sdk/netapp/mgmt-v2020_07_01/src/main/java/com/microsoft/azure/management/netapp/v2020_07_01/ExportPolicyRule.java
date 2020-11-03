/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Volume Export Policy Rule.
 */
public class ExportPolicyRule {
    /**
     * Order index.
     */
    @JsonProperty(value = "ruleIndex")
    private Integer ruleIndex;

    /**
     * Read only access.
     */
    @JsonProperty(value = "unixReadOnly")
    private Boolean unixReadOnly;

    /**
     * Read and write access.
     */
    @JsonProperty(value = "unixReadWrite")
    private Boolean unixReadWrite;

    /**
     * Kerberos5 Read only access. To be use with swagger version 2020-05-01 or
     * later.
     */
    @JsonProperty(value = "kerberos5ReadOnly")
    private Boolean kerberos5ReadOnly;

    /**
     * Kerberos5 Read and write access. To be use with swagger version
     * 2020-05-01 or later.
     */
    @JsonProperty(value = "kerberos5ReadWrite")
    private Boolean kerberos5ReadWrite;

    /**
     * Kerberos5i Read only access. To be use with swagger version 2020-05-01
     * or later.
     */
    @JsonProperty(value = "kerberos5iReadOnly")
    private Boolean kerberos5iReadOnly;

    /**
     * Kerberos5i Read and write access. To be use with swagger version
     * 2020-05-01 or later.
     */
    @JsonProperty(value = "kerberos5iReadWrite")
    private Boolean kerberos5iReadWrite;

    /**
     * Kerberos5p Read only access. To be use with swagger version 2020-05-01
     * or later.
     */
    @JsonProperty(value = "kerberos5pReadOnly")
    private Boolean kerberos5pReadOnly;

    /**
     * Kerberos5p Read and write access. To be use with swagger version
     * 2020-05-01 or later.
     */
    @JsonProperty(value = "kerberos5pReadWrite")
    private Boolean kerberos5pReadWrite;

    /**
     * Allows CIFS protocol.
     */
    @JsonProperty(value = "cifs")
    private Boolean cifs;

    /**
     * Allows NFSv3 protocol. Enable only for NFSv3 type volumes.
     */
    @JsonProperty(value = "nfsv3")
    private Boolean nfsv3;

    /**
     * Allows NFSv4.1 protocol. Enable only for NFSv4.1 type volumes.
     */
    @JsonProperty(value = "nfsv41")
    private Boolean nfsv41;

    /**
     * Client ingress specification as comma separated string with IPv4 CIDRs,
     * IPv4 host addresses and host names.
     */
    @JsonProperty(value = "allowedClients")
    private String allowedClients;

    /**
     * Has root access to volume.
     */
    @JsonProperty(value = "hasRootAccess")
    private Boolean hasRootAccess;

    /**
     * Get order index.
     *
     * @return the ruleIndex value
     */
    public Integer ruleIndex() {
        return this.ruleIndex;
    }

    /**
     * Set order index.
     *
     * @param ruleIndex the ruleIndex value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withRuleIndex(Integer ruleIndex) {
        this.ruleIndex = ruleIndex;
        return this;
    }

    /**
     * Get read only access.
     *
     * @return the unixReadOnly value
     */
    public Boolean unixReadOnly() {
        return this.unixReadOnly;
    }

    /**
     * Set read only access.
     *
     * @param unixReadOnly the unixReadOnly value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withUnixReadOnly(Boolean unixReadOnly) {
        this.unixReadOnly = unixReadOnly;
        return this;
    }

    /**
     * Get read and write access.
     *
     * @return the unixReadWrite value
     */
    public Boolean unixReadWrite() {
        return this.unixReadWrite;
    }

    /**
     * Set read and write access.
     *
     * @param unixReadWrite the unixReadWrite value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withUnixReadWrite(Boolean unixReadWrite) {
        this.unixReadWrite = unixReadWrite;
        return this;
    }

    /**
     * Get kerberos5 Read only access. To be use with swagger version 2020-05-01 or later.
     *
     * @return the kerberos5ReadOnly value
     */
    public Boolean kerberos5ReadOnly() {
        return this.kerberos5ReadOnly;
    }

    /**
     * Set kerberos5 Read only access. To be use with swagger version 2020-05-01 or later.
     *
     * @param kerberos5ReadOnly the kerberos5ReadOnly value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withKerberos5ReadOnly(Boolean kerberos5ReadOnly) {
        this.kerberos5ReadOnly = kerberos5ReadOnly;
        return this;
    }

    /**
     * Get kerberos5 Read and write access. To be use with swagger version 2020-05-01 or later.
     *
     * @return the kerberos5ReadWrite value
     */
    public Boolean kerberos5ReadWrite() {
        return this.kerberos5ReadWrite;
    }

    /**
     * Set kerberos5 Read and write access. To be use with swagger version 2020-05-01 or later.
     *
     * @param kerberos5ReadWrite the kerberos5ReadWrite value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withKerberos5ReadWrite(Boolean kerberos5ReadWrite) {
        this.kerberos5ReadWrite = kerberos5ReadWrite;
        return this;
    }

    /**
     * Get kerberos5i Read only access. To be use with swagger version 2020-05-01 or later.
     *
     * @return the kerberos5iReadOnly value
     */
    public Boolean kerberos5iReadOnly() {
        return this.kerberos5iReadOnly;
    }

    /**
     * Set kerberos5i Read only access. To be use with swagger version 2020-05-01 or later.
     *
     * @param kerberos5iReadOnly the kerberos5iReadOnly value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withKerberos5iReadOnly(Boolean kerberos5iReadOnly) {
        this.kerberos5iReadOnly = kerberos5iReadOnly;
        return this;
    }

    /**
     * Get kerberos5i Read and write access. To be use with swagger version 2020-05-01 or later.
     *
     * @return the kerberos5iReadWrite value
     */
    public Boolean kerberos5iReadWrite() {
        return this.kerberos5iReadWrite;
    }

    /**
     * Set kerberos5i Read and write access. To be use with swagger version 2020-05-01 or later.
     *
     * @param kerberos5iReadWrite the kerberos5iReadWrite value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withKerberos5iReadWrite(Boolean kerberos5iReadWrite) {
        this.kerberos5iReadWrite = kerberos5iReadWrite;
        return this;
    }

    /**
     * Get kerberos5p Read only access. To be use with swagger version 2020-05-01 or later.
     *
     * @return the kerberos5pReadOnly value
     */
    public Boolean kerberos5pReadOnly() {
        return this.kerberos5pReadOnly;
    }

    /**
     * Set kerberos5p Read only access. To be use with swagger version 2020-05-01 or later.
     *
     * @param kerberos5pReadOnly the kerberos5pReadOnly value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withKerberos5pReadOnly(Boolean kerberos5pReadOnly) {
        this.kerberos5pReadOnly = kerberos5pReadOnly;
        return this;
    }

    /**
     * Get kerberos5p Read and write access. To be use with swagger version 2020-05-01 or later.
     *
     * @return the kerberos5pReadWrite value
     */
    public Boolean kerberos5pReadWrite() {
        return this.kerberos5pReadWrite;
    }

    /**
     * Set kerberos5p Read and write access. To be use with swagger version 2020-05-01 or later.
     *
     * @param kerberos5pReadWrite the kerberos5pReadWrite value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withKerberos5pReadWrite(Boolean kerberos5pReadWrite) {
        this.kerberos5pReadWrite = kerberos5pReadWrite;
        return this;
    }

    /**
     * Get allows CIFS protocol.
     *
     * @return the cifs value
     */
    public Boolean cifs() {
        return this.cifs;
    }

    /**
     * Set allows CIFS protocol.
     *
     * @param cifs the cifs value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withCifs(Boolean cifs) {
        this.cifs = cifs;
        return this;
    }

    /**
     * Get allows NFSv3 protocol. Enable only for NFSv3 type volumes.
     *
     * @return the nfsv3 value
     */
    public Boolean nfsv3() {
        return this.nfsv3;
    }

    /**
     * Set allows NFSv3 protocol. Enable only for NFSv3 type volumes.
     *
     * @param nfsv3 the nfsv3 value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withNfsv3(Boolean nfsv3) {
        this.nfsv3 = nfsv3;
        return this;
    }

    /**
     * Get allows NFSv4.1 protocol. Enable only for NFSv4.1 type volumes.
     *
     * @return the nfsv41 value
     */
    public Boolean nfsv41() {
        return this.nfsv41;
    }

    /**
     * Set allows NFSv4.1 protocol. Enable only for NFSv4.1 type volumes.
     *
     * @param nfsv41 the nfsv41 value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withNfsv41(Boolean nfsv41) {
        this.nfsv41 = nfsv41;
        return this;
    }

    /**
     * Get client ingress specification as comma separated string with IPv4 CIDRs, IPv4 host addresses and host names.
     *
     * @return the allowedClients value
     */
    public String allowedClients() {
        return this.allowedClients;
    }

    /**
     * Set client ingress specification as comma separated string with IPv4 CIDRs, IPv4 host addresses and host names.
     *
     * @param allowedClients the allowedClients value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withAllowedClients(String allowedClients) {
        this.allowedClients = allowedClients;
        return this;
    }

    /**
     * Get has root access to volume.
     *
     * @return the hasRootAccess value
     */
    public Boolean hasRootAccess() {
        return this.hasRootAccess;
    }

    /**
     * Set has root access to volume.
     *
     * @param hasRootAccess the hasRootAccess value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withHasRootAccess(Boolean hasRootAccess) {
        this.hasRootAccess = hasRootAccess;
        return this;
    }

}

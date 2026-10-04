package com.dch.smartrecruiters.client

import com.dch.smartrecruiters.client.sap.SapCandidate
import com.dch.smartrecruiters.client.sap.SapCandidatePage

interface SapClient {

    /**
     * Returns one candidate from SAP for the given tenant.
     */
    fun getCandidate(
        tenantId: String,
        candidateId: String
    ): SapCandidate

    /**
     * Returns one page of SAP candidates for the given tenant.
     *
     * @param page zero-based page number
     * @param size maximum number of candidates on the page
     */
    fun getCandidates(
        tenantId: String,
        page: Int,
        size: Int
    ): SapCandidatePage
}
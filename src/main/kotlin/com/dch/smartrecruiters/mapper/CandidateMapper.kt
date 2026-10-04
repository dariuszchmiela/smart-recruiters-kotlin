package com.dch.smartrecruiters.mapper

import com.dch.smartrecruiters.client.sap.SapCandidate
import com.dch.smartrecruiters.domain.Candidate

class CandidateMapper {
    fun map(source: SapCandidate): Candidate = Candidate(
        id = source.id,
        tenantId = source.tenantId,
        firstName = source.firstName,
        lastName = source.lastName,
        email = source.email
    )
}
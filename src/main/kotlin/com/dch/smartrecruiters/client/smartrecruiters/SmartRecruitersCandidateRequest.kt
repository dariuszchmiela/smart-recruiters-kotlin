package com.dch.smartrecruiters.client.smartrecruiters

data class SmartRecruitersCandidateRequest(
    val externalId: String,
    val firstName: String,
    val lastName: String,
    val email: String
)
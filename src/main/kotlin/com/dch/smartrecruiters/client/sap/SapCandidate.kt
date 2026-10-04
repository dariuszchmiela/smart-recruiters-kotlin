package com.dch.smartrecruiters.client.sap

data class SapCandidate(
    val id: String,
    val tenantId: String,
    val firstName: String,
    val lastName: String,
    val email: String
)
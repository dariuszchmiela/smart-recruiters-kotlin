package com.dch.smartrecruiters.domain;

data class Candidate(
    val id: String,
    val tenantId: String,
    val firstName: String,
    val lastName: String,
    val email: String
    )
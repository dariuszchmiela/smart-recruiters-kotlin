package com.dch.smartrecruiters.validation

import com.dch.smartrecruiters.domain.Candidate

class CandidateValidator {

    fun validate(candidate: Candidate) {
        if (candidate.email.isBlank()) {
            throw CandidateValidationException("Candidate email is required")
        }
    }
}
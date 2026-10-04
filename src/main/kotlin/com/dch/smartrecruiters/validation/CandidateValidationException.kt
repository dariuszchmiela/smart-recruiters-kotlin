package com.dch.smartrecruiters.validation

/**
 * Signals invalid candidate data.
 */
class CandidateValidationException(
    message: String
) : RuntimeException(message)
package com.dch.smartrecruiters.client.sap

/**
 * One page of SAP candidates, ordered by candidate id.
 * Deliberately independent of Spring Data pagination types.
 */
data class SapCandidatePage(
    val items: List<SapCandidate>,
    val page: Int,
    val size: Int,
    val hasNext: Boolean
){
    fun nextPage(): Int = page + 1
}

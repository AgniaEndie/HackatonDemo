package ru.senkosan.demo.models.response

import ru.senkosan.demo.models.handle.*

data class PostApiResponse(
    val address: PostApiAddress,
    val addressSource: String,
    val availability: PostApiAvailability,
    val businessFilters: List<PostApiBusinessFilter>,
    val holidays: List<Any>,
    val individualFilters: List<PostApiIndividualFilter>,
    val isClosed: Boolean,
    val isTemporaryClosed: Boolean,
    val latitude: String,
    val longitude: String,
    val oktmo: String,
    val oktmoName: String,
    val opsService: List<Any>,
    val phones: List<PostApiPhone>,
    val postalCode: String,
    val serviceGroups: List<PostApiServiceGroup>,
    val settlement: String,
    val typeCode: String,
    val typeId: Int,
    val vacancies: List<PostApiVacancy>,
    val windowsCount: Int,
    val workingHours: List<PostApiWorkingHour>
)

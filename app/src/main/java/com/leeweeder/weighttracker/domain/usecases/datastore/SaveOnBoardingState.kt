package com.leeweeder.weighttracker.domain.usecases.datastore

import com.leeweeder.weighttracker.domain.repository.DataStoreRepository

class SaveOnBoardingState(
    private val repository: DataStoreRepository
) {
    suspend operator fun invoke(showOnBoarding: Boolean) {
        repository.saveOnBoardingState(showOnBoarding)
    }
}
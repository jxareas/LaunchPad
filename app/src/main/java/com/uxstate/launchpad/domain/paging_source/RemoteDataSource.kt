package com.uxstate.launchpad.domain.paging_source

import androidx.paging.PagingData
import com.uxstate.launchpad.domain.model.Launch
import kotlinx.coroutines.flow.Flow

interface RemoteDataSource {

    fun getPreviousLaunches(): Flow<PagingData<Launch>>
    fun getUpcomingLaunches(): Flow<PagingData<Launch>>
}

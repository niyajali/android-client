package com.mifos.feature.individual_collection_sheet.new_individual_collection_sheet.domain.use_case

import com.mifos.core.common.utils.Resource
import com.mifos.core.data.repository.NewIndividualCollectionSheetRepository
import com.mifos.core.network.model.RequestCollectionSheetPayload
import com.mifos.core.objects.collectionsheet.IndividualCollectionSheet
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetIndividualCollectionSheetUseCase @Inject constructor(private val repository: NewIndividualCollectionSheetRepository) {

    suspend operator fun invoke(payload: RequestCollectionSheetPayload): Flow<Resource<IndividualCollectionSheet>> =
        flow {
            try {
                emit(Resource.Loading())
                emit(Resource.Success(repository.getIndividualCollectionSheet(payload)))
            } catch (exception: Exception) {
                emit(Resource.Error(exception.message.toString()))
            }
        }
}
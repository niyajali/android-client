/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/android-client/blob/master/LICENSE.md
 */
package com.mifos.core.network.datamanager

import com.mifos.core.network.BaseApiManager
import com.mifos.core.objects.groups.CenterInfo
import com.mifos.core.objects.runreport.FullParameterListResponse
import com.mifos.core.objects.runreport.client.ClientReportTypeItem
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Rajan Maurya on 05/02/17.
 */
@Singleton
class DataManagerRunReport @Inject constructor(val mBaseApiManager: BaseApiManager) {
    suspend fun getReportCategories(
        reportCategory: String?,
        genericResultSet: Boolean,
        parameterType: Boolean,
    ): List<ClientReportTypeItem> {
        return mBaseApiManager.runReportsService.getReportCategories(
            reportCategory,
            genericResultSet,
            parameterType,
        )
    }

    suspend fun getReportFullParameterList(
        reportName: String,
        parameterType: Boolean,
    ): FullParameterListResponse {
        return mBaseApiManager.runReportsService
            .getReportFullParameterList(reportName, parameterType)
    }

    suspend fun getReportParameterDetails(
        parameterName: String,
        parameterType: Boolean,
    ): FullParameterListResponse {
        return mBaseApiManager.runReportsService
            .getReportParameterDetails(parameterName, parameterType)
    }

    suspend fun getRunReportWithQuery(
        reportName: String,
        options: Map<String, String>,
    ): FullParameterListResponse {
        return mBaseApiManager.runReportsService
            .getRunReportWithQuery(reportName, options)
    }

    suspend fun getCenterSummaryInfo(
        centerId: Int,
        genericResultSet: Boolean,
    ): List<CenterInfo> {
        return mBaseApiManager.runReportsService
            .getCenterSummaryInfo(centerId, genericResultSet)
    }

    suspend fun getRunReportOffices(
        parameterName: String,
        officeId: Int,
        parameterType: Boolean,
    ): FullParameterListResponse {
        return mBaseApiManager.runReportsService.getReportOffice(
            parameterName,
            officeId,
            parameterType,
        )
    }

    suspend fun getRunReportProduct(
        parameterName: String,
        currency: String,
        parameterType: Boolean,
    ): FullParameterListResponse {
        return mBaseApiManager.runReportsService.getReportProduct(
            parameterName,
            currency,
            parameterType,
        )
    }
}

/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/android-client/blob/master/LICENSE.md
 */
package com.mifos.core.objects.accounts.loan

data class Loan(
    var id: Int? = null,

    var accountNo: String? = null,

    var status: Status? = null,

    var clientId: Int? = null,

    var clientName: String? = null,

    var clientOfficeId: Int? = null,

    var loanProductId: Int? = null,

    var loanProductName: String? = null,

    var loanProductDescription: String? = null,

    var fundId: Int? = null,

    var fundName: String? = null,

    var loanOfficerId: Int? = null,

    var loanOfficerName: String? = null,

    var loanType: LoanType? = null,

    var currency: Currency? = null,

    var principal: Double? = null,

    var approvedPrincipal: Double? = null,

    var termFrequency: Int? = null,

    var termPeriodFrequencyType: TermPeriodFrequencyType? = null,

    var numberOfRepayments: Int? = null,

    var repaymentEvery: Int? = null,

    var repaymentFrequencyType: RepaymentFrequencyType? = null,

    var interestRatePerPeriod: Double? = null,

    var interestRateFrequencyType: InterestRateFrequencyType? = null,

    var annualInterestRate: Double? = null,

    var amortizationType: AmortizationType? = null,

    var interestType: InterestType? = null,

    var interestCalculationPeriodType: InterestCalculationPeriodType? = null,

    var transactionProcessingStrategyId: Int? = null,

    var transactionProcessingStrategyName: String? = null,

    var syncDisbursementWithMeeting: Boolean? = null,

    var timeline: Timeline? = null,

    var summary: Summary? = null,

    var feeChargesAtDisbursementCharged: Double? = null,

    var loanCounter: Int? = null,

    var loanProductCounter: Int? = null,

    var multiDisburseLoan: Boolean? = null,

    var canDisburse: Boolean? = null,

    var inArrears: Boolean? = null,

    var isNPA: Boolean? = null,

    var overdueCharges: List<Any> = ArrayList(),

    private val additionalProperties: MutableMap<String, Any> = HashMap(),
)

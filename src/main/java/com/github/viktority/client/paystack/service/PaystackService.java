package com.github.viktority.client.paystack.service;

import com.github.viktority.client.paystack.models.bank.Bank;
import com.github.viktority.client.paystack.models.charge.ChargeRequest;
import com.github.viktority.client.paystack.models.charge.ChargeResponseModel;
import com.github.viktority.client.paystack.models.payment.PaymentRequestModel;
import com.github.viktority.client.paystack.models.payment.PaymentResponseModel;
import com.github.viktority.client.paystack.models.subaccount.SubAccountRequestModel;
import com.github.viktority.client.paystack.models.subaccount.SubAccountRequestModelList;
import com.github.viktority.client.paystack.models.subaccount.SubAccountResponse;
import com.github.viktority.client.paystack.models.subaccount.UpdateSubAccountModel;


public interface PaystackService {
    ChargeResponseModel chargeCard(ChargeRequest chargeRequest);

    SubAccountResponse fetchSubAccount(String id_or_code);

    PaymentResponseModel transfer(PaymentRequestModel requestModel);

    SubAccountResponse createSubAccount(SubAccountRequestModel model);

    SubAccountRequestModelList getSubAccounts();

    SubAccountResponse updateSubAccount(UpdateSubAccountModel model, String id_or_code);

    Bank getBanks();

}

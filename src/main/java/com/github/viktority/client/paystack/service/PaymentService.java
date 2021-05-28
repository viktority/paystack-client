package com.github.viktority.client.paystack.service;

import com.github.viktority.client.paystack.models.charge.ChargeResponseModel;
import com.github.viktority.client.paystack.models.subaccount.SubAccountResponse;


public interface PaymentService {
    ChargeResponseModel chargeCard(String authorizationCode, String email, Double amount);

    SubAccountResponse fetchSubAccount(String subAccountCode, String token);
}

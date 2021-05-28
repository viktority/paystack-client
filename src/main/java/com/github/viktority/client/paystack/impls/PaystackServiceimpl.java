package com.github.viktority.client.paystack.impls;

import com.github.viktority.client.Paystack;
import com.github.viktority.client.paystack.PaystackClient;
import com.github.viktority.client.paystack.models.bank.Bank;
import com.github.viktority.client.paystack.models.charge.ChargeRequest;
import com.github.viktority.client.paystack.models.charge.ChargeResponseModel;
import com.github.viktority.client.paystack.models.payment.PaymentRequestModel;
import com.github.viktority.client.paystack.models.payment.PaymentResponseModel;
import com.github.viktority.client.paystack.models.subaccount.SubAccountRequestModel;
import com.github.viktority.client.paystack.models.subaccount.SubAccountRequestModelList;
import com.github.viktority.client.paystack.models.subaccount.SubAccountResponse;
import com.github.viktority.client.paystack.models.subaccount.UpdateSubAccountModel;
import com.github.viktority.client.paystack.service.PaystackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaystackServiceimpl implements PaystackService {

    @Autowired
    PaystackClient paystackClient;
    String apiKey;

    {
        this.apiKey = Paystack.getApiKey();
        if (apiKey == null || apiKey.isEmpty()) throw new RuntimeException("Invalid API Key");
    }

    @Override
    public ChargeResponseModel chargeCard(ChargeRequest chargeRequest) {
        return paystackClient.chargeCard(chargeRequest, apiKey);
    }

    @Override
    public SubAccountResponse fetchSubAccount(String id_or_code) {
        return paystackClient.fetchSubAccount(id_or_code, apiKey);
    }

    @Override
    public PaymentResponseModel transfer(PaymentRequestModel requestModel) {
        return paystackClient.transfer(requestModel, apiKey);
    }

    @Override
    public SubAccountResponse createSubAccount(SubAccountRequestModel model) {
        return paystackClient.createSubAccount(model, apiKey);
    }

    @Override
    public SubAccountRequestModelList getSubAccounts() {
        return paystackClient.getSubAccounts(apiKey);
    }

    @Override
    public SubAccountResponse updateSubAccount(UpdateSubAccountModel model, String id_or_code) {
        return paystackClient.updateSubAccount(model, id_or_code, apiKey);
    }

    @Override
    public Bank getBanks() {
        return paystackClient.getBanks(apiKey);
    }
}

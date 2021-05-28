package com.github.viktority.client.paystack;


import com.github.viktority.client.paystack.models.bank.Bank;
import com.github.viktority.client.paystack.models.charge.ChargeRequest;
import com.github.viktority.client.paystack.models.charge.ChargeResponseModel;
import com.github.viktority.client.paystack.models.payment.PaymentRequestModel;
import com.github.viktority.client.paystack.models.payment.PaymentResponseModel;
import com.github.viktority.client.paystack.models.subaccount.SubAccountRequestModel;
import com.github.viktority.client.paystack.models.subaccount.SubAccountRequestModelList;
import com.github.viktority.client.paystack.models.subaccount.SubAccountResponse;
import com.github.viktority.client.paystack.models.subaccount.UpdateSubAccountModel;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(url = "${paystack.server.url}", name = "paystack")
public interface PaystackClient {

    @RequestLine("POST /transfer/bulk ")
    @Headers({"Authorization: {token}", "Content-Type: application/json"})
    PaymentResponseModel payDispatchers(@RequestBody PaymentRequestModel requestModel, @Param("token") String token);

    @RequestLine("POST /transaction/charge_authorization")
    @Headers({"Authorization: {token}", "Content-Type: application/json"})
    ChargeResponseModel chargeCard(@RequestBody ChargeRequest chargeRequest, @Param("token") String token);

    @RequestLine("POST /subaccount")
    @Headers({"Authorization: {token}", "Content-Type: application/json"})
    SubAccountResponse createSubAccount(@RequestBody SubAccountRequestModel model, @Param("token") String token);

    @RequestLine("GET /subaccount")
    @Headers({"Authorization: {token}", "Content-Type: application/json"})
    SubAccountRequestModelList getSubAccounts(@Param("token") String token);

    @RequestLine("GET /subaccount/{id_or_code}")
    @Headers({"Authorization: {token}", "Content-Type: application/json"})
    SubAccountResponse fetchSubAccount(@Param("id_or_code") String id_or_code, @Param("token") String token);


    @RequestLine("PUT /subaccount/{id_or_code}")
    @Headers({"Authorization: {token}", "Content-Type: application/json"})
    SubAccountResponse updateSubAccount(@RequestBody UpdateSubAccountModel model, @Param("token") String token, @Param("id_or_code") String id_or_code);

    @RequestLine("GET /bank")
    @Headers({"Authorization: {token}", "Content-Type: application/json"})
    Bank getBanks(@Param("token") String token);

}



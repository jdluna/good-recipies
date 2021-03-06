package com.defmacros.goodrecipes.backendsvc.utils;

import com.defmacros.goodrecipes.backendsvc.dto.ServiceError;

import java.util.UUID;

import static com.defmacros.goodrecipes.backendsvc.utils.ErrorConstants.ERROR_CODE_SERVER_INTERVAL_ERROR;
import static com.defmacros.goodrecipes.backendsvc.utils.ErrorConstants.ERROR_MSG_SERVER_INTERVAL_ERROR;

public class ServiceUtils {

    public static String generateErrorReferenceCode() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static ServiceError internalError(String errorRefCode) {
        String errorMessage = ERROR_MSG_SERVER_INTERVAL_ERROR.replace("{1}", errorRefCode);
        return new ServiceError(ERROR_CODE_SERVER_INTERVAL_ERROR, errorMessage);
    }
}

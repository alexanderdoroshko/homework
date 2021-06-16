package by.teachmeskills.myeshop.utils;

import by.teachmeskills.myeshop.exceptions.RequestParamNullException;

public class HttpRequestParamValidator {
    private static final String REQUEST_PARAMETER_IS_NULL_ERROR = "Request parameter is not initialized";

    public static void ValidateParamNotNull(String param) throws RequestParamNullException {
        if (param == null) {
            throw new RequestParamNullException(REQUEST_PARAMETER_IS_NULL_ERROR);
        }

    }
}

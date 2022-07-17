package com.test.awslambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<Request, Response> {


    @Override
    public Response handleRequest(Request request, Context context) {
        return new Service().getResponse(request);
    }
}

package com.test.awslambda;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Service {

    public Response getResponse(Request request){
        Response response=new Response();
        ObjectMapper objectMapper=new ObjectMapper();
        try{
            BasicUserInfo basicUserInfo   = objectMapper.readValue(request.getBody(), BasicUserInfo.class);
                  response.setBody(basicUserInfo.toString());
                  response.setStatusCode(200);
        }
        catch (Exception e){
            response.setBody(e.getMessage());
            response.setStatusCode(500);
        }
        return response;
    }
}

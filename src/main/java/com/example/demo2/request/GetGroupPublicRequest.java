package com.example.demo2.request;

import java.util.Map;

public class GetGroupPublicRequest extends RequestMap {
    @Override
   public void fromRequest(Map<String, String> header, Map<String, ?> body) {
        token=header.get("token");

    }
}

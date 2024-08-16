package com.z7.bespoke.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GateWayController {

    @GetMapping("/gateWay/reload")
    public String reload() {
        return System.currentTimeMillis() + "";
    }
}

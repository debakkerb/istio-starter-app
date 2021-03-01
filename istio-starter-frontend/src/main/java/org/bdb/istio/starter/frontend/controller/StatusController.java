package org.bdb.istio.starter.frontend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/status")
    HttpStatus status() {
        return HttpStatus.OK;
    }
}

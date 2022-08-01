package com.axyya.flightms;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@org.springframework.cloud.openfeign.FeignClient(name="PassengerMS")
public interface FeignClient {
    @GetMapping("/passenger/allPassenger")
    public List getDataPassenger();

    @GetMapping("/passenger/byId/{pass_id}")
    public String getPassById(@PathVariable Long pass_id);
}

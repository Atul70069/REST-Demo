package com.ThinkConstructive.restDemo.controller;

import com.ThinkConstructive.restDemo.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudApiService {


    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId)
    {
        return  cloudVendor;

//            return new     CloudVendor("c1",
//                "Atul","up",
//                "8299479596");
    }


    @PostMapping
    public  String  createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor=cloudVendor;
        return "ADDED SUCCESSFULLY";

    }

    @PutMapping
    public  String  updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor=cloudVendor;
        return "Updated SUCCESSFULLY";

    }


    @DeleteMapping("{vendorId}")
    public  String  updateCloudVendorDetails( String vendorId)
    {
        this.cloudVendor=null;
        return "DELETED SUCCESSFULLY";

    }


}

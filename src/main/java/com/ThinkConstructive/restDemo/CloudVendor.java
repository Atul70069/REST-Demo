package com.ThinkConstructive.restDemo;

public class CloudVendor {

    private String vebdorId;
    private String vendorName;
    private String VendorAddress;
    private String VendorPhoneNumber;

    public CloudVendor()
    {

    }

    public String getVebdorId() {
        return vebdorId;
    }

    public void setVebdorId(String vebdorId) {
        this.vebdorId = vebdorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return VendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        VendorAddress = vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return VendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        VendorPhoneNumber = vendorPhoneNumber;
    }

    public CloudVendor(String vebdorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        this.vebdorId = vebdorId;
        this.vendorName = vendorName;
        VendorAddress = vendorAddress;
        VendorPhoneNumber = vendorPhoneNumber;
    }
}

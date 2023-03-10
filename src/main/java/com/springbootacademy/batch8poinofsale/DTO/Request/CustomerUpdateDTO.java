package com.springbootacademy.batch8poinofsale.DTO.Request;

public class CustomerUpdateDTO {

    private int customerId;
    private  String customerName;
    private String customerAddress;
    private String nic;

    public CustomerUpdateDTO() {

    }

    public CustomerUpdateDTO(int customerId, String customerName, String customerAddress, String nic) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.nic = nic;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    @Override
    public String toString() {
        return "CustomerUpdateDTO{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", nic='" + nic + '\'' +
                '}';
    }
}

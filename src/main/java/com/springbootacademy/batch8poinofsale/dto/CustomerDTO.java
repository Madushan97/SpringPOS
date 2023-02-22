package com.springbootacademy.batch8poinofsale.dto;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.ArrayList;

public class CustomerDTO {

    private int customerId;
    private String customerName;
    private String customerAddress;
    private ArrayList contactNumbers;
    private String nic;
    private boolean activeStatus;

    public CustomerDTO(int customerId, String customerName, String customerAddress, ArrayList contactNumbers, String nic, boolean activeStatus) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.contactNumbers = contactNumbers;
        this.nic = nic;
        this.activeStatus = activeStatus;
    }

    public CustomerDTO() {

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

    public ArrayList getContactNumbers() {
        return contactNumbers;
    }

    public void setContactNumbers(ArrayList contactNumbers) {
        this.contactNumbers = contactNumbers;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", contactNumbers=" + contactNumbers +
                ", nic='" + nic + '\'' +
                ", activeStatus=" + activeStatus +
                '}';
    }
}

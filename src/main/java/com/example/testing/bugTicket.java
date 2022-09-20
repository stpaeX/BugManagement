package com.example.testing;

public class bugTicket {
    private String employeeName;
    private String bugInfo;
    private String status;

    public String getEmployeeName() {
        return employeeName;
    }

    public String getBugInfo() {
        return bugInfo;
    }

    public String getStatus() {
        return status;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setBugInfo(String bugInfo) {
        this.bugInfo = bugInfo;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "bugTicket{" +
                "employeeName='" + employeeName + '\'' +
                ", bugInfo='" + bugInfo + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

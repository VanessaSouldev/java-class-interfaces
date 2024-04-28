abstract class SmsContactInfo implements ContactInfo {

    private String phoneNumber;

    public SmsContactInfo(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void sendMessage() {
        System.out.println("Email send to " + phoneNumber);
    }

}

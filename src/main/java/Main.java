public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Frodo", "Balings", new MasterCard(0), new EmailContact("frodo@novi.nl"));
        customer.getCreditCard().pay(100);
        customer.printName();
        System.out.println(customer.getCreditCard().getDebt());


        Customer customer2 = new Customer("Samwise", "Gamgee", new VisaCard(0), new SmsContactInfo("0622446080") {
            @Override
            public String getPhoneNumber() {
                return super.getPhoneNumber();
            }
        });
        customer2.getCreditCard().pay(100);

        customer2.printName();
        System.out.println(customer2.getCreditCard().getDebt());

        customer.getContactInfo().sendMessage();
        customer2.getContactInfo().sendMessage();

    }
}

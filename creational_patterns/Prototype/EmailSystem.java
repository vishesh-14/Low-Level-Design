package creational_patterns.Prototype;

import java.util.List;

public class EmailSystem {
    public static  void main(String[] args){
        RecipientList baseRecipients = new RecipientList(List.of("all@company.com"),List.of("archive@company.com"));
        EmailTemplate template = new EmailTemplate("Monthly Report", "Please find the attached monthly report",baseRecipients);

        EmailTemplate marketingEmail = template.clone();
        marketingEmail.setSubject("Special Offer");
        marketingEmail.setBody("Don't miss our special offer this month!");
        marketingEmail.getRecipientList().addTo("marketing@compay.com");

        EmailTemplate engineeringEmail = template.clone();
        engineeringEmail.setSubject("System Maintenance");
        engineeringEmail.getRecipientList().addCc("maintance@company.com");

        System.out.println("Base Template:");
        template.print();
        System.out.println("\nMarketing Email:");
        marketingEmail.print();
        System.out.println("\nEngineering Email:");
        engineeringEmail.print();
    }
}

package creational_patterns.Prototype;

public class EmailTemplate {
    private String subject;
    private String body;
    private RecipientList recipientList;

    public EmailTemplate(String subject, String body, RecipientList recipientList) {
        this.subject = subject;
        this.body = body;
        this.recipientList = recipientList;
    }

    public EmailTemplate clone() {
        return new EmailTemplate(subject, body, recipientList.deepCopy());
    }

    public String getSubject() {
        return subject;
    }

    public String setSubject(String subject) {
        this.subject = subject;
        return subject;
    }

    public String getBody() {
        return body;
    }

    public String setBody(String body) {
        this.body = body;
        return body;
    }
    public RecipientList getRecipientList() {
        return recipientList;
    }
    public void print(){
        System.out.println("Email : "+subject + " Body : "+body + " To : "+recipientList.toString());
    }
}

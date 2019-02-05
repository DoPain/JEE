package bean;

import java.util.ArrayList;
import java.util.Date;

public class DueDocument extends Document {

    private Date dueDate;

    public DueDocument(String title,
                       String content,
                       Date creationDate,
                       Date lastModification,
                       ArrayList<Document> mesDocuments,
                       Date dueDate) {
        super(title, content, creationDate, lastModification, mesDocuments);
        this.dueDate = dueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}

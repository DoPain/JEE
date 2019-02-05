package bean;

import java.util.ArrayList;
import java.util.Date;

public class Document {

    private String title;
    private String content;
    private Date creationDate;
    private Date lastModification;

    private ArrayList<Document> mesDocuments;

    public Document(){}

    public Document(String title,
                    String content,
                    Date creationDate,
                    Date lastModification,
                    ArrayList<Document> mesDocuments) {
        this.title = title;
        this.content = content;
        this.creationDate = creationDate;
        this.lastModification = lastModification;
        this.mesDocuments = mesDocuments;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getLastModification() {
        return lastModification;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setLastModification(Date lastModification) {
        this.lastModification = lastModification;
    }

    public ArrayList<Document> getMesDocuments() {
        return mesDocuments;
    }

    public void setMesDocuments(ArrayList<Document> mesDocuments) {
        this.mesDocuments = mesDocuments;
    }
}

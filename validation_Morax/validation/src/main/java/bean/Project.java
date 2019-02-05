package bean;

public class Project {

    private String description;
    private String name;
    private String urlRepository;

    public Project(String description, String name, String urlRepository) {
        this.description = description;
        this.name = name;
        this.urlRepository = urlRepository;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getUrlRepository() {
        return urlRepository;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrlRepository(String urlRepository) {
        this.urlRepository = urlRepository;
    }
}

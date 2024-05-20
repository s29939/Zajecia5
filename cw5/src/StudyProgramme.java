class StudyProgramme {
    private String name;
    private String description;
    private int numberOfSemesters;
    private int allowedITNs;

    public StudyProgramme(String name, String description, int numberOfSemesters, int allowedITNs) {
        this.name = name;
        this.description = description;
        this.numberOfSemesters = numberOfSemesters;
        this.allowedITNs = allowedITNs;
    }

    // Getters and setters for all fields

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }

    public void setNumberOfSemesters(int numberOfSemesters) {
        this.numberOfSemesters = numberOfSemesters;
    }

    public int getAllowedITNs() {
        return allowedITNs;
    }

    public void setAllowedITNs(int allowedITNs) {
        this.allowedITNs = allowedITNs;
    }



}
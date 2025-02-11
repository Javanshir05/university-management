class AcademicInfo extends Student {
    private double gpa;
    private int credit;
    private String faculty;
    private int graduationYear;

    public AcademicInfo(String name, String email, String address, double gpa, int credit, String faculty, int graduationYear) {
        super(name, email, address);
        this.gpa = gpa;
        this.credit = credit;
        this.faculty = faculty;
        this.graduationYear = graduationYear;
    }

    public double getGpa() {
        return gpa;
    }

    public int getCredit() {
        return credit;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }
}
import java.util.List;

public class module {
    private String name;
    private String id;
    private List<student> Students;
    private List<courseProgramme> Courses;


    public module (String name,String id )
    {

        this.name =name;
        this.id=id;
       


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<student> getStudents() {
        return Students;
    }

    public void setStudents(List<student> Students) {
        this.Students = Students;
    }

    public List<courseProgramme> getCourses() {
        return Courses;
    }

    public void setCourses(List<courseProgramme> Courses) {
        this.Courses = Courses;
    }


}


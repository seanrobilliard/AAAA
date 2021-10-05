import java.util.List;

public class module {
    private String name;
    private String id;
    private List<student> Students;
    private List<String> Courses;


    public module (String name,String id,List<student> Students,List<String> Courses )
    {

        this.name =name;
        this.id=id;
        this.Students=Students;
        this.Courses=Courses;


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

    public List<String> getCourses() {
        return Courses;
    }

    public void setCourses(List<String> Courses) {
        this.Courses = Courses;
    }


}


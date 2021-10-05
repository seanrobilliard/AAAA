import org.joda.time.DateTime;

import java.util.List;

public class courseProgramme {

    private String name;
    private List<module> Modules;
    private List<student> Students;
    private DateTime startDate;
    private DateTime endDate;

    public courseProgramme( String name,DateTime startDate,DateTime endDate)
    {
        this.name=name;
        this.startDate=startDate;
        this.endDate=endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<module> getModules() {
        return Modules;
    }

    public void setModules(List<module> Modules) {
        this.Modules = Modules;
    }

    public List<student> getStudents() {
        return Students;
    }

    public void setStudents(List<student> Students) {
        this.Students = Students;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

}

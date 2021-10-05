import java.util.List;

public class student {
    private String Name;
    private int Age;
    private String DOB;
    private int ID;
    private String username;
    private List<String> modules;

    public student ( String Name ,int Age,String DOB ,int ID,List <String> modules )
    {
        this.Name = Name;
        this.Age=Age;
        this.DOB = DOB ;
        this.ID=ID;
        this.modules=modules;

    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return Name.concat(Integer.toString(Age));
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }







}




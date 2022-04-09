package IT.department;

public class AdminDepartment extends SuperDepartment{

    public String departmentName(){
        String departmentname = "Admin department";
        return departmentname;
    }

    public String getTodaysWork(){
        String work = "complete your document submission";
        return work;
    }

    public String getWorkDeadline(){
        String deadline = "complete by EOD";
        return deadline;
    }
}

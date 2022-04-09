package IT.department;

public class HrDepartment extends SuperDepartment{
    public String departmentName (){
        return "Hr department";
    }

    public String getTodaysWork (){
        return "Fill today worksheet, and mark your attendance";
    }

    public String getWorkDeadline (){
        return "complete by EOD";
    }

    public String doActivity (){
        return "team lunch";
    }
}

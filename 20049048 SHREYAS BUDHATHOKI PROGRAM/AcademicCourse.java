public class AcademicCourse extends course 
{
     String LecturerName;
     String Level;
     String Credit;
     String StartingDate;
     String CompletingDate;
     int NumberofAssessments;
      boolean isRegistered;
     //creating constructor for Academic Course
    public AcademicCourse(String CourseID,String CourseName,int Duration,String Level,String Credit,int NumberofAssessments){
        super (CourseID,CourseName,Duration);
        LecturerName="";
        this.Level=Level;
        this.Credit=Credit;
        StartingDate="";
        CompletingDate="";
        this.NumberofAssessments=NumberofAssessments;
        isRegistered= false;
    }
    //creating accessor method
    public String getLecturerName(){
        return LecturerName;
    }
    public String getLevel(){
        return Level;
    }
    public String getCredit(){
        return Credit;
    }
    public String getStartingDate(){
        return StartingDate;
    }
    public String getCompletingDate(){
        return CompletingDate;
    }
    public int  getNumberofAssessments(){
        return NumberofAssessments;
    }
    public boolean getisRegistered(){
        return isRegistered;
    }
    //creating a method to set Lecturer Name
    public void setLecturerName(String LecturerName){
       this.LecturerName=LecturerName; 
    }
    //creating a method to set Number of Assessmenst 
    public void setNumberofAssessments(int NumberofAssessments){
       this. NumberofAssessments= NumberofAssessments; 
    }
    
     public void register(String CourseLeader,String LecturerName , String StartingDate, String CompletingDate )
    { 
        /*creating a method to register course details 
         * if register is true messages are displayed
         * otherwise a inputs are taken
        */
        if (isRegistered == true)
        {    
              System.out.println("the AcademicCourse is already registered");
              System.out.println("the Lecturer name is" + getLecturerName());
              System.out.println("the Starting date is" + getStartingDate());
              System.out.println("the Completing date is" + getCompletingDate());
        }
        else 
        {
              super.setCourseLeader(CourseLeader);
              this.LecturerName= LecturerName;
              this.StartingDate= StartingDate;
              this.CompletingDate= CompletingDate;
              this.isRegistered = true; 
       
        }
    }
    public void Display()
    {
        /*method to display lecturer name , level , credit , starting date completion date and number of assessments by if isregistered=true
         * otherwise a message is shown
         */
        super.Display();
        if (isRegistered == true)
        {
        System.out.println("The Lecturername is "+ getLecturerName());
        System.out.println("The Level is " + getLevel());
        System.out.println("The Credit is " + getCredit());
        System.out.println("The StartingDate is "+ getStartingDate());
        System.out.println("The CompletingDate is " + getCompletingDate());
        System.out.println("The NumberofAssessments is " + getNumberofAssessments());
        }
         else
         {
        System.out.println("Courses has not been registered");
        }
    }
}   
    

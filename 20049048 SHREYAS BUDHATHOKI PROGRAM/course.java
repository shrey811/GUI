public class course
{
      String CourseID;
      String CourseName;
      String CourseLeader;
      int Duration;
     //creating constructor for course
        public course(String CourseID,String CourseName,int Duration){
        this.CourseID=CourseID;
        this.CourseName=CourseName;
        this.CourseLeader="";
        this.Duration=Duration;
    }
    //creating accessor methods
    
    public String getCourseID()
    {
        return CourseID;
    }
    public String getCourseName()
    {
        return CourseName;
    
    }
    public String getCourseLeader(){
        return CourseLeader;
    }
      public int getDuration()
    {
        return Duration;
    }
    
    //method created for changing value of Course Leader
    public void setCourseLeader(String CourseLeader)
    {
       this.CourseLeader=CourseLeader;
    }
    
    /*method to display Course ID Course Name Duration 
     * if Course keader is not empty string then message is displayed
     */
    
    public void Display()
    {
        System.out.println("The course ID is "+ getCourseID());
        System.out.println("The course name is " + getCourseName());
        System.out.println("The duration is " + getDuration());
        if (CourseLeader!="")
        {
            System.out.println ("The courseleader is "+ getCourseLeader());
        }
    }
}

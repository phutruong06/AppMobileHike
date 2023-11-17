package com.example.text;
public class    CourseModal {

    // variables for our coursename,
    // description, tracks and duration, id.
    private String courseName;
    private String courseDuration;
    private String courseTracks;

    private String courseLength;
    private String courseLevel;
    private String courseParking;
    private String courseDescription;

    private int id;

    // creating getter and setter methods
    public String getCourseName() { return courseName; }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public String getCourseDuration()
    {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration)
    {
        this.courseDuration = courseDuration;
    }

    public String getCourseTracks() { return courseTracks; }

    public void setCourseTracks(String courseTracks)
    {
        this.courseTracks = courseTracks;
    }

    public String getCourseLevel() { return courseLevel; }

    public void setCourseLevel(String courseLevel)
    {
        this.courseLevel = courseLevel;
    }

    public String getCourseParking() { return courseParking; }

    public void setCourseParking(String courseParking)
    {
        this.courseParking = courseParking;
    }




    public String getCourseLength() { return courseLength; }

    public void setCourseLength(String courseLength)
    {
        this.courseLength = courseLength;
    }



    public String getCourseDescription()
    {
        return courseDescription;
    }

    public void
    setCourseDescription(String courseDescription)
    {
        this.courseDescription = courseDescription;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    // constructor
    public CourseModal(String courseName,
                       String courseDuration,
                       String courseTracks,
                       String courseParking,
                       String courseLength,
                       String courseLevel,
                       String courseDescription)
    {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.courseTracks = courseTracks;
        this.courseParking = courseParking;
        this.courseLength = courseLength;
        this.courseLevel = courseLevel;
        this.courseDescription = courseDescription;
    }
}

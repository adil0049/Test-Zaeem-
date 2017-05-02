public class Kindergarden {
    public Manager manager;
    public Teacher teachers;
    public Child children;  
    
    public void setManager(Manager manager) {
        this.manager = manager; 
    }

    public void addChild(Child children) {
        this.children = children;
    }

    public void addTeacher(Teacher teachers) {
        this.teachers = teachers;
    }

    public void printChildren() {
        System.out.println(children);
    }

    public void printTeachers() {
        //System.out.println(children + hourlySalary);
        System.out.println(children);
    }
}
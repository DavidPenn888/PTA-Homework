class Student {
    private int no;
    private String name;
    private String sex;

    Student(int no,String name,String sex) {
        this.no = no;
        this.name = name;
        this.sex = sex;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    void attendClass(String className) {

    }

    public void print() {
        System.out.println("no: "+no);
        System.out.println("name: "+name);
        System.out.println("sex: "+sex);
    }
}

class CollegeStudent extends Student {
    private int no;
    private String name;
    private String sex;
    private String major;

    CollegeStudent(int no,String name,String sex,String major) {
        super(no, name, sex);
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.major = major;
    }
    public void print() {
        System.out.println("no: "+no);
        System.out.println("name: "+name);
        System.out.println("sex: "+sex);
        System.out.println("major: "+major);
    }
}

class GraduateStudent extends CollegeStudent {
    private int no;
    private String name;
    private String sex;
    private String major;
    private String supervisor;

    GraduateStudent(int no,String name,String sex,String major,String supervisor) {
        super(no, name, sex, major);
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.major = major;
        this.supervisor = supervisor;
    }

    public void print() {
        System.out.println("no: "+no);
        System.out.println("name: "+name);
        System.out.println("sex: "+sex);
        System.out.println("major: "+major);
        System.out.println("supervisor: "+supervisor);
    }

    void doResearch() {
        System.out.println(name+" is doing research");
    }
}
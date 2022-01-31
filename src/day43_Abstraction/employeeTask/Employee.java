package day43_Abstraction.employeeTask;

public abstract class Employee extends Person{

    private final int id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
       this.id = id;
       setJobTitle(jobTitle);
       setSalary(salary);
    }

    public abstract void work();

    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle.isBlank() || jobTitle.isEmpty()){
            throw new RuntimeException("Invalid job title: "+ jobTitle);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            throw new RuntimeException("Invalid salary: "+salary);
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

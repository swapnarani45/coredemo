public class Person5 {
    private Job job;//composition has a relationship
   
    public Person5(){
        this.job=new Job();
        job.setSalary(1000L);
        job.setRole("Manager");
        job.setId(9);
    }
    public void dispDetails() {
        System.out.println(job.getSalary()+" "+job.getId()+" "+job.getRole());
    }
}
 
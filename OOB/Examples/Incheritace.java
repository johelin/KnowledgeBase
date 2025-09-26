public class Incheritace {
    String name;
    int age;
    boolean educated;

    public boolean isEducated() {
        return educated = true; // method that returns true if the person is educated
    }
}

final class jobApplicant extends Incheritace{
    String jobTitle;

    public void applyForJob(String jobTitle){ // method that doesn't return anything but checks if the applicant is educated or not.
        if(isEducated()){
            System.out.println("You are qualified for the job as " + jobTitle);
        } else {
            System.out.println("You are not qualified for the job as " + jobTitle);
        }
    }

    public static void main(String[] args) {
        jobApplicant applicant = new jobApplicant();
        applicant.applyForJob("Software Engineer");
        applicant.isEducated();
    }
}

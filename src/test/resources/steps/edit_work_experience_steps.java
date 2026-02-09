public class edit_work_experience_steps {

    @Given("I have a CV and I'm on the edit description page")
    public void I_have_a_CV_and_Im_on_the_edit_description_page() {
        Employee employee = new Employee("Sally");
        employee.createCV();
    }

}
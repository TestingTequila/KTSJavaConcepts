package day25;

public class FortisHospital extends Hospital implements USMedicalAssociation, UKMedicalAssociation, IndianMedicalAssociation
{

    @Override
    public void cardioServices() {
        System.out.println("FH---cardio Services");
    }

    @Override
    public void neuroServices() {
        System.out.println("FH----neuroServices");
    }

    @Override
    public void physioServices() {
        System.out.println("FH---physioServices");
    }

    @Override
    public void emergencyServices() {
        System.out.println("FH---commonUS/UK/I---emergencyServices");
    }

    @Override
    public void entServices() {
        System.out.println("FH----entServices");
    }

    @Override
    public void dentalServices() {
        System.out.println("FH----dentalServices");

    }

    @Override
    public void oncologyServices() {
        System.out.println("FH---oncologyServices");
    }

    @Override
    public void gynicServices() {
        System.out.println("FH---gynicServices");

    }

    @Override
    public void orthoServices() {
        System.out.println("FH---orthoServices");

    }

    public  void medicalTraining()
    {
        System.out.println("FH--self---medicalTraining");
    }

    public  void medicalInsurance()
    {
        System.out.println("FH--self---medicalInsurance");
    }

    @Override
    public void covidVaccination() {
        System.out.println("FH---WHO-->USMA---covidVaccination");
    }

    @Override
    public void childCareServices() {
        System.out.println("FH---WHO-->USMA---childCareServices");
    }
}

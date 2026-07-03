package day25;

public class TestFortisHospital {
    public static void main(String[] args) {
        FortisHospital fh = new FortisHospital();
        fh.cardioServices(); //inherited from USMA
        fh.neuroServices();  //inherited USMA
        fh.physioServices(); //inherited USMA
        fh.entServices();    //inherited UKMA
        fh.dentalServices(); //inherited UKMA
        fh.oncologyServices(); //inherited IMA
        fh.gynicServices();//inherited IMA
        fh.orthoServices();//inherited IMA

        fh.medicalTraining(); //FH self Services
        fh.medicalInsurance();//FH self Services

        fh.emergencyServices(); // common Service from US/UK/I

        fh.medicalRnD(); //Inherited from Hospital class
        fh.medicalNews();//Inherited from Hospital class
        fh.covidVaccination();// coming from WHO through USMA


        System.out.println("====Top Casting with USMedicalAssociation=======");

        USMedicalAssociation usma = new FortisHospital();
        usma.cardioServices();
        usma.physioServices();
        usma.neuroServices();
        usma.emergencyServices(); // common Service from US/UK/I
        usma.covidVaccination(); // coming from WHO through USMA


        System.out.println("====Top Casting with UKMedicalAssociation=======");

        UKMedicalAssociation ukma = new FortisHospital();
        ukma.entServices();
        ukma.dentalServices();
        ukma.emergencyServices();// common Service from US/UK/I



        System.out.println("====Top Casting with IndianMedicalAssociation=======");
        IndianMedicalAssociation ima = new FortisHospital();
        ima.oncologyServices();
        ima.gynicServices();
        ima.orthoServices();
        ima.emergencyServices();// common Service from US/UK/I

        System.out.println("====Top Casting with WHO=======");

        WHO who = new FortisHospital();
        who.covidVaccination();



    }
}

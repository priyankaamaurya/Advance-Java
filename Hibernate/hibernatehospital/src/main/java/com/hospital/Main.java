package com.hospital;

public class Main {

    public static void main(String[] args) {

        DoctorDao dao = new DoctorDao();

        // 🔹 CREATE DOCTOR
        Doctor doc = new Doctor();
        doc.setDoctorId(501);
        doc.setDoctorName("Dr. Sharma");
        doc.setConsultationFee(800.0f);
        doc.setSpecialization("Cardiology");

        // 🔹 SAVE
        dao.save(doc);
        System.out.println("Doctor Saved");

        // 🔹 FIND
        Doctor d = dao.find(501);
        System.out.println("Name: " + d.getDoctorname());
        System.out.println("Fee: " + d.getConsultationFee());
        System.out.println("Specialization: " + d.getSpecialization());

        // 🔹 UPDATE
        d.setConsultationFee(1000.0f);
        dao.update(d);
        System.out.println("Doctor Updated");

        // 🔹 DELETE
//        dao.delete(501);
//        System.out.println("Doctor Deleted");
    }
}
